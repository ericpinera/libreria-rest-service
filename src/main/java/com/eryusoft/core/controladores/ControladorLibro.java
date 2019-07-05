package com.eryusoft.core.controladores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eryusoft.core.modelo.Libro;
import com.eryusoft.core.servicios.LibroServicio;

@RestController
@RequestMapping("/libros")
public class ControladorLibro 
{
	private final LibroServicio libroServicio;

	public ControladorLibro(LibroServicio libroServicio) {
		this.libroServicio = libroServicio;
	}
	
	@GetMapping
	public Iterable<Libro> list()
	{
		return libroServicio.buscarTodos();		
	}
	
	@GetMapping("/{isbn}")
	public ResponseEntity<Libro> get(@PathVariable("isbn") String isbn)
	{
		return libroServicio.buscar(isbn)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	
	
	

}

package com.eryusoft.core.servicios;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.eryusoft.core.modelo.Libro;

@Service
public class LibroServicioEnMemoria implements LibroServicio 
{

	private final Map<String, Libro> libros = new ConcurrentHashMap<>();	
	
	@Override
	public Iterable<Libro> buscarTodos() {
		return libros.values();
	}

	@Override
	public Libro crearLibro(Libro libro) {
		libros.put(libro.getIsbn(), libro);
		return libro;
	}

	@Override
	public Optional<Libro> buscar(String isbn) {
		return Optional.ofNullable(libros.get(isbn));
	}
	

}

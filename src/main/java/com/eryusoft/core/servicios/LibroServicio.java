package com.eryusoft.core.servicios;

import java.util.Optional;

import com.eryusoft.core.modelo.Libro;

public interface LibroServicio 
{
	Iterable<Libro> buscarTodos();
	Libro crearLibro(Libro libro);
	Optional<Libro> buscar(String isbn);
}

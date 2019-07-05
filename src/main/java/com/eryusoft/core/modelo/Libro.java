package com.eryusoft.core.modelo;

import java.util.*;

public class Libro 
{
	private String isbn;
	private String titulo;
	private List<String> autores = new ArrayList<>();
	
	
	public Libro() {}
	
	public Libro(String isbn, String titulo, String ... autores) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autores.addAll(Arrays.asList(autores));
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getAutores() {
		return Collections.unmodifiableList(autores);
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Libro libro = (Libro) obj;
		return Objects.equals(isbn, libro.isbn);
	}

	@Override
	public String toString() {
		return String.format("Libro [isbn=%s, titulo=%s, autores=%s]", 
				this.isbn, this.titulo, this.autores );
	}
	
	

	
	
	
	
	
	

}

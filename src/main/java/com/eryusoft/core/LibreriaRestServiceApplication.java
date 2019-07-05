package com.eryusoft.core;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.eryusoft.core.modelo.Libro;
import com.eryusoft.core.servicios.LibroServicio;

@SpringBootApplication
public class LibreriaRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaRestServiceApplication.class, args);
	}
	
	@Bean
	public ApplicationRunner InicializadorLibros(LibroServicio libroServicio) 
	{
		return arg -> {					
			libroServicio.crearLibro(new Libro("9780061120084", "To Kill a Mockingbird", "Harper Lee"));
			libroServicio.crearLibro(new Libro("9780451524935", "1984", "George Orwell"));
			libroServicio.crearLibro(new Libro("9780618260300", "The Hobbit", "J.R.R. Tolkien"));			
		};		
	}	

}

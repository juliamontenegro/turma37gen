package org.generation.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Postagem")
@CrossOrigin("*")

public class PostagemController {
	
		@Autowired
		private PostagemRepository repository;
		
		@GetMapping
		public ResponseEntity<List<Postagem>>findAllPostagens() {
			return ResponseEntity.ok(repository.findAll());
		}
		
		@GetMapping ("/PorId/{id}") 
		public Optional<Postagem>findById(@PathVariable("id")Long id) {
			return repository.findById(id);
		}
		
		@GetMapping ("/PorTitulo/{titulo}") 
		public Postagem findById(@PathVariable("titulo")String titulo) {
			return repository.getByTitulo(titulo);
		}
}
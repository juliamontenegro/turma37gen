package org.generation.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Postagem")
@CrossOrigin("*")

public class PostagemController {
	
		@Autowired
		private PostagemRepository repository;
		
		@GetMapping
		public ResponseEntity<List<Postagem>> findAllPostagens(){
			return ResponseEntity.ok(repository.findAll());
		}
		
		@GetMapping("/porTitulo/{titulo}")
		public ResponseEntity<Postagem> getByTitulo(@PathVariable("titulo") String titulo){
			return ResponseEntity.ok(repository.getByTituloContainingIgnoreCase(titulo));
		}
		
		@PostMapping
		public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
		}
		
		@PutMapping
		public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
		}
		
		@DeleteMapping("/{id}")
		public void delete(@PathVariable Long id) {
			repository.deleteById(id);
		}
		
}

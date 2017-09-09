package br.com.dvaltrick.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dvaltrick.models.Artigo;
import br.com.dvaltrick.services.ArtigoService;

@RestController
public class ArtigoController {
	@Autowired
	ArtigoService artigoService;
	
	
	@RequestMapping(method=RequestMethod.POST,
					value="/artigos", 
					consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Artigo> salvarArtigo(@RequestBody Artigo artigo){
		Artigo salvo = artigoService.salvarArtigo(artigo);
		
		return new ResponseEntity<Artigo>(salvo, HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.GET,
			value="/artigos", 
			produces=MediaType.APPLICATION_JSON_VALUE)	
	public ResponseEntity<Collection<Artigo>> buscarTodosArtigos(){
		Collection<Artigo> artigosBuscados = artigoService.buscarTodos();
		return new ResponseEntity<Collection<Artigo>>(artigosBuscados, HttpStatus.OK);
	}
}

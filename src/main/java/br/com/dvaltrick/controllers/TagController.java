package br.com.dvaltrick.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dvaltrick.models.Tag;
import br.com.dvaltrick.services.TagService;

@RestController
public class TagController {
	@Autowired
	TagService tagService;
	
	@RequestMapping(method=RequestMethod.POST,
			value="/tags", 
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Tag> salvarTag(@RequestBody Tag tag){
	Tag salvo = tagService.salvarTag(tag);
	
		return new ResponseEntity<Tag>(salvo, HttpStatus.CREATED);
	}

	@RequestMapping(method=RequestMethod.GET,
		value="/tags", 
		produces=MediaType.APPLICATION_JSON_VALUE)	
	public ResponseEntity<Collection<Tag>> buscarTodasTags(){
		Collection<Tag> tagsBuscadas = tagService.buscarTodos();
		return new ResponseEntity<Collection<Tag>>(tagsBuscadas, HttpStatus.OK);
	}

	@RequestMapping(method=RequestMethod.GET,
		value="/tags/{id}", 
		produces=MediaType.APPLICATION_JSON_VALUE)	
	public ResponseEntity<Tag> buscarTag(@PathVariable Integer id){
		Tag tag = tagService.buscarTag(id); 
		return new ResponseEntity<Tag>(tag, HttpStatus.OK);
	}

}

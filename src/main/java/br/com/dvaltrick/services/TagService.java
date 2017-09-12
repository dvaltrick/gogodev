package br.com.dvaltrick.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dvaltrick.models.Artigo;
import br.com.dvaltrick.models.Tag;
import br.com.dvaltrick.repository.ArtigoRepository;
import br.com.dvaltrick.repository.TagRepository;

@Service
public class TagService {
	@Autowired
	TagRepository tagRepository;

	public Tag salvarTag(Tag salvar){
		return tagRepository.save(salvar);
	}

	public Collection<Tag> buscarTodos() {
		// TODO Auto-generated method stub
		return tagRepository.findAll();
	}

	public Tag buscarTag(Integer id) {
		return tagRepository.findOne(id);
	}
}

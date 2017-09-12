package br.com.dvaltrick.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dvaltrick.models.Artigo;
import br.com.dvaltrick.repository.ArtigoRepository;

@Service
public class ArtigoService {
	@Autowired
	ArtigoRepository artigoRepository;
	
	public Artigo salvarArtigo(Artigo salvar){
		return artigoRepository.save(salvar);
	}

	public Collection<Artigo> buscarTodos() {
		// TODO Auto-generated method stub
		return artigoRepository.findAll();
	}

	public Artigo buscarArtigo(Integer id) {
		return artigoRepository.findOne(id);
	}

}

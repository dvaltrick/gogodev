package br.com.dvaltrick.models;

import java.util.Set;
import java.util.HashSet;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.UniqueConstraint;
import javax.persistence.Id;

@Entity
public class Artigo {
	@Id
	@GeneratedValue
	private Integer id;
	private String titulo;
	private String texto;

	@ElementCollection
	@CollectionTable(name = "tags_artigo", 
					 joinColumns = @JoinColumn(name = "id"))
	private Set<Tag> tags = new HashSet<Tag>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public Set<Tag> getTags() {
		return tags;
	}
	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

	
}

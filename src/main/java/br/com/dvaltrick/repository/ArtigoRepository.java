package br.com.dvaltrick.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.dvaltrick.models.Artigo;

@Repository
public interface ArtigoRepository extends JpaRepository<Artigo,Integer> {

}

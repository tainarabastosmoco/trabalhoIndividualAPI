package br.org.serratec.trabalho.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.trabalho.biblioteca.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}

package br.com.jcavi.javaweb.sisvendas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jcavi.javaweb.sisvendas.entity.Categoria;
import br.com.jcavi.javaweb.sisvendas.entity.Produto;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAll();
	
	public List<Categoria> findAllByNome(String nome);
	
	public Categoria findByNome(String nome);
	
	public List<Categoria> findAllByProdutos(Produto produto);

}

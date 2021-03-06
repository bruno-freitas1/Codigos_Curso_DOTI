package br.com.itaumon.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itaumon.projeto.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	
	//DAO - Data Access Object - dentro dele vem o CRUD
	// CrudRepository é um classe que pertence ao JPA e interligamos ao model Usuario que criamos
	// Integer é o tipo da chave primária da classe Usuario que é INT
	// Nessa classe será criado os médodos CRUD (Create, Read, Update and Delete)
	
	// os metodos dentor do CrudRepository retornam um Iterable
	
	//Criar um metodo para busca por nome e senha
	//Usuario findByNomeAndSenha(String nome, String senha);
	
	Usuario findByEmailAndSenha(String email, String senha);
	
}

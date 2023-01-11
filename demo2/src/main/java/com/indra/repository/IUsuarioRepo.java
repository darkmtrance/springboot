package com.indra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indra.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
	
	Usuario findByNombre(String nombre);
}

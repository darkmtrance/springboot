package com.indra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indra.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer> {

}

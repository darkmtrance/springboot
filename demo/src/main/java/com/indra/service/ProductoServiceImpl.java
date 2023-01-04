package com.indra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.indra.repository.IProductoRepo;
import com.indra.repository.ProductoRepoImpl;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	@Qualifier("producto1")
	IProductoRepo repo;
	
	@Override
	public void registrar(String nombre) {
		//repo = new ProductoRepoImpl();
		
		repo.registrar(nombre);
	}
	
}

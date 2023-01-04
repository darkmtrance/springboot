package com.indra.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.indra.DemoConsolaApplication;

@Repository
@Qualifier("producto1")
public class ProductoRepoImpl implements IProductoRepo {

	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	
	@Override
	public void registrar(String nombre) {
		LOG.info("Se registro a "+ nombre);
		
	}
	
}

package com.indra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.indra.service.IProductoService;
import com.indra.service.ProductoServiceImpl;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Autowired
	private IProductoService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("hola mundo");
		//service = new ProductoServiceImpl();
		
		service.registrar("Indra");
		
	}

}

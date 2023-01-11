package com.indra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.indra.entity.Producto;
import com.indra.repository.ProductoRepository;

@RestController
@RequestMapping("api/producto")
public class ProductoController {
	
	@Autowired
	private ProductoRepository repo;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Producto> listarProducto(){
		return repo.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void insertar(@RequestBody Producto producto) {
		repo.save(producto);
	}
}

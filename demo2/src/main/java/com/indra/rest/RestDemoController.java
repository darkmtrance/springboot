package com.indra.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.model.Producto;
import com.indra.repository.IProductoRepo;

@RestController
@RequestMapping("productos")
public class RestDemoController {
	
	@Autowired
	private IProductoRepo repo;
	
	@GetMapping
	public List<Producto> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Producto producto){
		repo.save(producto);
	}
	
	@PutMapping
	public void modificar(@RequestBody Producto producto) {
		repo.save(producto);
	}
	
	@DeleteMapping(value = "/{id}")
	public void borrar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
}

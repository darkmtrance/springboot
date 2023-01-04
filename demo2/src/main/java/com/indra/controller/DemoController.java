package com.indra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.indra.model.Producto;
import com.indra.repository.IProductoRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IProductoRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Producto p = new Producto();
		p.setIdProducto(1);
		p.setNombre("indra");
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting2(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		model.addAttribute("productos", repo.findAll());
		model.addAttribute("name", name);
		return "greeting";
	}
}

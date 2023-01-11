package com.indra.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(value="producto")
@Getter
@Setter
@NoArgsConstructor
public class Producto {
	@Id
	private String id;
	private String nombre;
	private String descripcion;
	private Double precio;
	
}

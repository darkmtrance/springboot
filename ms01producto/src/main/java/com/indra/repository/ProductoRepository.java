package com.indra.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.indra.entity.Producto;

public interface ProductoRepository extends MongoRepository<Producto, String> {

}

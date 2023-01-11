package com.indra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.indra.model.Usuario;
import com.indra.repository.IUsuarioRepo;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner {

	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario user = new Usuario();
		user.setId(2);
		user.setNombre("indra");
		user.setClave(encoder.encode("12345"));
		Usuario  userNew = repo.save(user);
		
	}

}

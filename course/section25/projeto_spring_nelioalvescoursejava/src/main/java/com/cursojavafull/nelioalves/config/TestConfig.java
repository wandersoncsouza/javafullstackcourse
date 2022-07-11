package com.cursojavafull.nelioalves.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cursojavafull.nelioalves.entities.User;
import com.cursojavafull.nelioalves.repositories.UserRepository;

@Configuration		// Identifica a classe como classe de configuração (auxiliar)
@Profile("test")	// Identifica para qual perfil especifico esta classe é utilizada (test) somente executará essa classe no perfil de teste.
public class TestConfig implements CommandLineRunner{
	
	@Autowired		// Mecanismo de injeção de depenência do UserRepository
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}

	
}

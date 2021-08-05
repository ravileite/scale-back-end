package com.scale.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.scale.project.model.User;
import com.scale.project.repository.UserRepository;

@SpringBootApplication
public class ScaleProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScaleProjectApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {	
		this.userRepository.save(new User("George","Bluth","george.bluth@reqres.in","https://reqres.in/img/faces/1-image.jpg"));
		this.userRepository.save(new User("Janet", "Weaver", "janet.weaver@reqres.in","https://reqres.in/img/faces/2-image.jpg"));
		this.userRepository.save(new User("Emma", "Wong", "emma.wong@reqres.in","https://reqres.in/img/faces/3-image.jpg"));
		this.userRepository.save(new User("Eve", "Holt", "eve.holt@reqres.in","https://reqres.in/img/faces/4-image.jpg"));
		this.userRepository.save(new User("Charles", "Morris", "charles.morris@reqres.in","https://reqres.in/img/faces/5-image.jpg"));
		this.userRepository.save(new User("Tracey", "Ramos", "tracey.ramos@reqres.in","https://reqres.in/img/faces/6-image.jpg"));
		this.userRepository.save(new User("Michael", "Lawson", "michael.lawson@reqres.in","https://reqres.in/img/faces/7-image.jpg"));
		this.userRepository.save(new User("Lindsay", "Ferguson", "lindsay.ferguson@reqres.in","https://reqres.in/img/faces/8-image.jpg"));
		this.userRepository.save(new User("Tobias", "Funke", "tobias.funke@reqres.in","https://reqres.in/img/faces/9-image.jpg"));
		this.userRepository.save(new User("Byron", "Fields", "byron.fields@reqres.in","https://reqres.in/img/faces/10-image.jpg"));
		this.userRepository.save(new User("George", "Edwards", "george.edwards@reqres.in","https://reqres.in/img/faces/11-image.jpg"));
		this.userRepository.save(new User("Rachel", "Howell", "rachel.howell@reqres.in","https://reqres.in/img/faces/12-image.jpg"));
	}
}

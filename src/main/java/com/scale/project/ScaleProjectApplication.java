package com.scale.project;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.scale.project.model.Country;
import com.scale.project.model.CountryCode;
import com.scale.project.model.User;
import com.scale.project.repository.CountryCodeRepository;
import com.scale.project.repository.CountryRepository;
import com.scale.project.repository.UserRepository;

@SpringBootApplication
public class ScaleProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScaleProjectApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CountryCodeRepository countryCodeRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Override
	public void run(String... args) throws Exception {	
		//Questão 1
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
		
		//Questão 2
		this.countryCodeRepository.save(new CountryCode("COL","COLOMBIA"));
		this.countryCodeRepository.save(new CountryCode("BRA","BRASIL"));
		this.countryCodeRepository.save(new CountryCode("ECU","EQUADOR"));
		this.countryCodeRepository.save(new CountryCode("PAN","PANAMA"));
		this.countryCodeRepository.save(new CountryCode("PER","PERU"));
		this.countryCodeRepository.save(new CountryCode("VEN","VENEZUELA"));
		this.countryCodeRepository.save(new CountryCode("ARG","ARGENTINA"));
		this.countryCodeRepository.save(new CountryCode("BOL","BOLIVIA"));
		this.countryCodeRepository.save(new CountryCode("GUF","GUIANA FRANCESA"));
		this.countryCodeRepository.save(new CountryCode("PRY","PARAGUAI"));
		this.countryCodeRepository.save(new CountryCode("SUR","SURINAME"));
		this.countryCodeRepository.save(new CountryCode("CHL","CHILE"));
		this.countryCodeRepository.save(new CountryCode("URY","URUGUAI"));
		
		String[] a1 = {"BRA", "ECU", "PAN", "PER", "VEN"};
		String[] a2 = {"ARG", "BOL", "COL", "GUF", "GUY", "PRY", "PER", "SUR", "URY", "VEN"};
		String[] a3 = {"COL", "PER"};
		String[] a4 = {"COL"};
		String[] a5 = {"BOL", "BRA", "CHL", "COL", "ECU"};
		String[] a6 = {"BRA", "COL", "GUF"};
		String[] a7 = {"BOL", "BRA", "CHL", "PRY", "URY"};
		String[] a8 = {"ARG", "BRA", "CHL", "PRY", "PER"};
		String[] a9 = {"BRA", "SUR", "VEN"};
		String[] a10 = {"ARG", "BOL", "BRA"};
		String[] a11 = {"BRA", "GUF", "GUY"};
		String[] a12 = {"ARG", "BRA"};
		String[] a13 = {"ARG", "BOL", "PER"};
		
		this.countryRepository.save(new Country("COL", new ArrayList<String>(Arrays.asList(a1))));
		this.countryRepository.save(new Country("BRA", new ArrayList<String>(Arrays.asList(a2))));
		this.countryRepository.save(new Country("ECU", new ArrayList<String>(Arrays.asList(a3))));
		this.countryRepository.save(new Country("PAN", new ArrayList<String>(Arrays.asList(a4))));
		this.countryRepository.save(new Country("PER", new ArrayList<String>(Arrays.asList(a5))));
		this.countryRepository.save(new Country("VEN", new ArrayList<String>(Arrays.asList(a6))));
		this.countryRepository.save(new Country("ARG", new ArrayList<String>(Arrays.asList(a7))));
		this.countryRepository.save(new Country("BOL", new ArrayList<String>(Arrays.asList(a8))));
		this.countryRepository.save(new Country("GUF", new ArrayList<String>(Arrays.asList(a9))));
		this.countryRepository.save(new Country("PRY", new ArrayList<String>(Arrays.asList(a10))));
		this.countryRepository.save(new Country("SUR", new ArrayList<String>(Arrays.asList(a11))));
		this.countryRepository.save(new Country("CHL", new ArrayList<String>(Arrays.asList(a12))));
		this.countryRepository.save(new Country("URY", new ArrayList<String>(Arrays.asList(a13))));
	}
}

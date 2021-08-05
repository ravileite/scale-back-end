package com.scale.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scale.project.repository.CountryCodeRepository;
import com.scale.project.repository.CountryRepository;
import com.scale.project.model.Country;
import com.scale.project.model.CountryCode;

@Service
public class CountryService {
	
	@Autowired
	CountryRepository countryRepository;
	
	@Autowired
	CountryCodeRepository countryCodeRepository;
	
	
	public List<Country> getCountries(){
		List<Country> countries =  countryRepository.findAll();
		
		return countries;
	}

	public List<CountryCode> getCountriesCodes(){
		List<CountryCode> countriesCodes = countryCodeRepository.findAll();
		
		return countriesCodes;
	}
}

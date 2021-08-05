package com.scale.project.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scale.project.repository.CountryCodeRepository;
import com.scale.project.repository.CountryRepository;
import com.scale.project.service.CountryService;
import com.scale.project.model.Country;
import com.scale.project.model.CountryCode;

@Service
public class CountryServiceImpl implements CountryService{
	
	private static final Logger log = LoggerFactory.getLogger(CountryServiceImpl.class);
	
	@Autowired
	CountryRepository countryRepository;
	
	@Autowired
	CountryCodeRepository countryCodeRepository;
	
	
	public List<Country> getCountries(){
		log.info("Searching for countries...");
		List<Country> countries =  countryRepository.findAll();
		
		return countries;
	}

	public List<CountryCode> getCountriesCodes(){
		log.info("Searching for countries codes...");
		List<CountryCode> countriesCodes = countryCodeRepository.findAll();
		
		return countriesCodes;
	}
}

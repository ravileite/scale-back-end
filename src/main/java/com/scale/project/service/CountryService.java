package com.scale.project.service;

import java.util.List;

import com.scale.project.model.Country;
import com.scale.project.model.CountryCode;

public interface CountryService {
	
	/**
	 * Return all countries in data base
	 * 
	 * @return List<Country>
	 */
	public List<Country> getCountries();
	
	
	/**
	 * Return all codes countries in data base
	 * 

	 * @return List<CountryCode> 
	 */
	public List<CountryCode> getCountriesCodes();
}
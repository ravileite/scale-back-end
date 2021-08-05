package com.scale.project.service;

import java.util.List;

import com.scale.project.model.Country;
import com.scale.project.model.CountryCode;

public interface CountryService {
	public List<Country> getCountries();
	
	public List<CountryCode> getCountriesCodes();
}
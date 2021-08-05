package com.scale.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.scale.project.dto.CountryDTO;
import com.scale.project.model.Country;
import com.scale.project.model.CountryCode;
import com.scale.project.service.CountryService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	/**
	 * Return all countries, your codes and borders in descending order by borders number
	 * 
	 * @return ResponseEntity<List<CountryDTO>>
	 */
	@GetMapping("countries")
	public ResponseEntity<List<CountryDTO>> getCountries(){
		List<Country> countries = countryService.getCountries();
		List<CountryCode> countriesCodes = countryService.getCountriesCodes();
		ArrayList<CountryDTO> countriesDTO = countryToDTOArrayList(countries, countriesCodes);
		
		quickSort(countriesDTO, 0, countriesDTO.size() - 1);
		
		return new ResponseEntity<List<CountryDTO>>(countriesDTO, HttpStatus.OK);
	}
	
	private ArrayList<CountryDTO> countryToDTOArrayList(List<Country> countries, List<CountryCode> countriesCodes) {		
		Map<String, ArrayList<String>> map = new HashMap<>();
		ArrayList<CountryDTO> countryDTOArray = new ArrayList<CountryDTO>();
		
		for (Country country : countries) {
			map.put(country.getCode(), country.getBorders());
		}
		
		for (CountryCode countryCode : countriesCodes) {
			CountryDTO countryDTO = new CountryDTO();
			countryDTO.setCode(countryCode.getCode());
			countryDTO.setCountry_name(countryCode.getCountry_name());
			countryDTO.setBorders(map.get(countryCode.getCode()));
			
			countryDTOArray.add(countryDTO);
		}		
		
		return countryDTOArray;
	}
	
	private void quickSort(ArrayList<CountryDTO> array, int first, int last) {
		if(first < last) {
			int pivotIndex = partition(array, first, last);
			quickSort(array, first, pivotIndex);
			quickSort(array, pivotIndex + 1, last);
		}
	}
	
	private int partition(ArrayList<CountryDTO> array, int first, int last) {
        CountryDTO pivot = array.get(first);
        int f = first;
        
        for(int j = first + 1; j <= last; j++) {
        	if(array.get(j).getBorders().size() > pivot.getBorders().size()) {
        		f = f + 1;
        		CountryDTO aux = array.get(f);
        		array.set(f, array.get(j));
        		array.set(j, aux);
        	}
        }
        
        CountryDTO aux = array.get(f);
        array.set(f, array.get(first));
        array.set(first, aux);
        
        return f;
  }
}

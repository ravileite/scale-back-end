package com.scale.project.dto;

import java.util.ArrayList;

public class CountryDTO {
	
	private String country_name;
	private String code;
	private ArrayList<String> borders;
	
	public CountryDTO() {
		
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ArrayList<String> getBorders() {
		return borders;
	}

	public void setBorders(ArrayList<String> borders) {
		this.borders = borders;
	}

	@Override
	public String toString() {
		return "CountryDTO [country_name=" + country_name + ", code=" + code + ", borders=" + borders
				+ "]";
	}
}

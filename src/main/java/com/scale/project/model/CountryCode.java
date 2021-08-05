package com.scale.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries_codes")
public class CountryCode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "code", unique = true)
	private String code;
	
	@Column(name = "country_name")
	private String country_name;
	
	public CountryCode() {
		
	}

	public CountryCode(String code, String country_name) {
		super();
		this.code = code;
		this.country_name = country_name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	@Override
	public String toString() {
		return "CountryCode [id=" + id + ", code=" + code + ", country_name=" + country_name + "]";
	}
	
}

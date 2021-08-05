package com.scale.project.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "code", unique = true)
	private String code;
	
	@Column(name = "borders")
	private ArrayList<String> borders;
	
	public Country() {
		
	}

	public Country(String code, ArrayList<String> borders) {
		super();
		this.code = code;
		this.borders = borders;
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

	public ArrayList<String> getBorders() {
		return borders;
	}

	public void setBorders(ArrayList<String> borders) {
		this.borders = borders;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", code=" + code + ", borders=" + borders + "]";
	}
}

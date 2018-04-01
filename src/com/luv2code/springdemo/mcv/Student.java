package com.luv2code.springdemo.mcv;

import java.util.LinkedHashMap;


public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countries;
	private LinkedHashMap<String, String> languages;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public Student() {
		countries = new LinkedHashMap<>();
		countries.put("BR", "Brazil");
		countries.put("RU","Russia");
		countries.put("UK", "Ukrain");
		countries.put("TR", "Turkey");
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	public void setCountries(LinkedHashMap<String, String> countries) {
		this.countries = countries;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getLanguages() {
		return languages;
	}

	public void setLanguages(LinkedHashMap<String, String> languages) {
		this.languages = languages;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
}

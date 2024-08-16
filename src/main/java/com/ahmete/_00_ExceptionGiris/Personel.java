package com.ahmete._00_ExceptionGiris;

public class Personel {
	private String name;
	private String surname;
	
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public Personel(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return "Personel{" + "name='" + getName() + '\'' + ", surname='" + getSurname() + '\'' + '}';
	}
}
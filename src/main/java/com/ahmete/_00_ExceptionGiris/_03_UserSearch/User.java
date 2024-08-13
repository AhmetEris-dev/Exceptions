package com.ahmete._00_ExceptionGiris._03_UserSearch;

import java.util.Random;

public class User {
	private long id;
	private String name;
	
	public User(String name) {
		this.id=new Random().nextLong();
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "User{" + "id=" + getId() + ", name='" + getName() + '\'' + '}';
	}
}
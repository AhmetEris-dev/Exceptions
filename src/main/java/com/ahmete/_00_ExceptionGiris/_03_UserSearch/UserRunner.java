package com.ahmete._00_ExceptionGiris._03_UserSearch;

public class UserRunner {
	public static void main(String[] args) {
		UserRepository repository=new UserRepository();
		User su = repository.getUserByName("salih");
		System.out.println(su);
	}
}
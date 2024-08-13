package com.ahmete._00_ExceptionGiris._03_UserSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
	List<User> users;
	
	public UserRepository() {
		this.users = new ArrayList<>();
		users.add(new User("Ayhan"));
		users.add(new User("Berk"));
		users.add(new User("Bahar"));
		users.add(new User("Su"));
		users.add(new User("Can"));
		users.add(new User("Emel"));
	}
	
	/**
	 * bu metod dışarıdan gönderilen isimde bir kullanıcı bulursa o kullanıcı geri dönecek
	 * eğer bulamazsa null dönmeyelim kendi exceptionımızı fırlatalım
	 */
	
	public User getUserByName(String name){
		Optional<User> optionalUser = users.stream()
		                            .filter(user -> user.getName().equalsIgnoreCase(name))
		                            .findFirst();
		
		return optionalUser.orElseThrow();
	}
}
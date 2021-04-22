package com.restwebservicesudemy.restwebservicesudemy.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<Users> users = new ArrayList<>();
	private static int usersCount = 3;
	static {
		users.add(new Users(1, "abc", new Date()));
		users.add(new Users(2, "xyz", new Date()));
		users.add(new Users(3, "pqr", new Date()));
	}
	
	// find all
	
	public List<Users> findAll(){
		return users;
	}
	
	//save
	public Users save(Users user) {
		if(user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	//findone
	
	public Users findOne(int id) {
		for(Users user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;	
	}
}

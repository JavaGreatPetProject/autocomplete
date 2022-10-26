package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.*;

@Service
public class UserService {
	
	List<User> users = new ArrayList<>();
	
	public UserService() {
		users.add(new User("1","Андрей"));
    	users.add(new User("2","Борис"));
    	users.add(new User("3","Эдуард"));
    	users.add(new User("4","Сергей"));
    	users.add(new User("5","Артур"));
	}

	public List<User> getAll(){
		return users;
	}
	
	public User getUsersByName(String name){
		for (int i = 0; i < users.size(); i++) {
			if(name.equalsIgnoreCase(users.get(i).getName())) {
				System.out.println(users.get(i).getName());
				return users.get(i);
				
			}
		}	
		return null;
	}
	
	public List<User> getUsersByNameStartingWith(String startStr){
		List<User> newList = new ArrayList<User>();
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getName().toLowerCase().startsWith(startStr.toLowerCase())) {
				System.out.println(users.get(i).getName());
				newList.add(users.get(i));	
			}
		}

		return newList;
	}
}

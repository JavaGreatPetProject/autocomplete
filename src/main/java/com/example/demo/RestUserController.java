package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUserController {

	@Autowired
	UserService service;

	@RequestMapping("/all")
	public List<User> getAll() {
		return service.getAll();
	}

	/*
	 * @RequestMapping("/{name}") public User getUsersByName(@PathVariable("name")
	 * String name){ System.out.println(name); return service.getUsersByName(name);
	 * }
	 */

	/*
	 * @RequestMapping("/{name}") public List<String>
	 * getUsersByNameStartWith(@PathVariable("name") String name) {
	 * System.out.println(name); List<String> names = new ArrayList<String>();
	 * List<User> users = service.getUsersByNameStartingWith(name); for (User user :
	 * users) { names.add(user.getName()); System.out.print(user.getName() + " "); }
	 * return names; }
	 */

	
	@RequestMapping("/{name}")
	public List<User> getUsersByNameStartWith(@PathVariable("name") String name) {
		return service.getUsersByNameStartingWith(name);
	}

}

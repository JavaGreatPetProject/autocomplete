package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting() {
        return "greeting";
    }

    @GetMapping
    public String main(Model model) {
        model.addAttribute("some", "hello, man!");
        return "main";
    }
    @GetMapping("/example")
    public String example() {
        return "example";
    }
	/*
	 * @PostMapping("/fetchExample") public String
	 * fetchExample( @RequestParam(name="name", required=false) String name) {
	 * 
	 * ObjectMapper objectMapper = new ObjectMapper(); System.out.println(name);
	 * List<User> users = new ArrayList<User>(); users.add(new User("Андрей"));
	 * users.add(new User("Борис")); users.add(new User("Эдуард")); users.add(new
	 * User("Сергей"));
	 * 
	 * 
	 * 
	 * String result = "none"; try { result =
	 * objectMapper.writeValueAsString(users); } catch (JsonProcessingException e) {
	 * System.out.println(e); } System.out.println("!" + result);
	 * 
	 * return "greeting"; }
	 */
}

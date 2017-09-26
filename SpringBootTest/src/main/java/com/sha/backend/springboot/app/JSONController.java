package com.sha.backend.springboot.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sha.backend.model.Person;

@Controller
@RestController
@RequestMapping("/sboot")
public class JSONController {

	@RequestMapping("/firstrest")
	@ResponseBody
	public Person getJsonFile() {
		Person person = new Person();
		person.setFirstName("Shankar");
		person.setLastName("KS");
		person.setEmail("shankar@sha.com");
		person.setPin("123");
		return person;
	}
}

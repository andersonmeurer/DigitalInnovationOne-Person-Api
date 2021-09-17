package one.digitalinovation.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinovation.personapi.service.PersonService;

@RestController
@RequestMapping("/api/v1/people")
public class Personcontroller {

	@Autowired
	private PersonService service;

	@GetMapping
	public String Personcontroller() {
		return "API Test!";
	}
}

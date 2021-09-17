package one.digitalinovation.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import one.digitalinovation.personapi.service.PersonService;

@Controller
@RequestMapping("/api/v1/people")
public class Personcontroller {

	@Autowired
	private PersonService service;

	public ResponseEntity Personcontroller() {
		return ResponseEntity.ok();
	}
}

package com.hello.hello.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/learn")
public class LearnResource {

	@GetMapping
	public ResponseEntity<List<String>> getLearningGoals() {
		List<String> list = new ArrayList<>();
		
		list.add("Definir layout visual do Projeto Integrador");
		list.add("Evoluir com o blog pessoal");
		list.add("Aprofundar em Docker");
		

		return ResponseEntity.ok().body(list);

	}

}

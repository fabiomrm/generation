package com.hello.hello.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bsms")
public class BsmResource {

	@GetMapping
	public ResponseEntity<List<String>> getBsms() {
		List<String> list = new ArrayList<>();
		
		list.add("Mentalidade de Crescimento");
		list.add("Persistência");
		list.add("Responsabilidade Pessoa");
		list.add("Orientação ao futuro");
		list.add("Comunicação");
		list.add("Orientação ao Detalhe");
		list.add("Proatividade");
		list.add("Trabalho em Equipe");
		

		return ResponseEntity.ok().body(list);

	}

}

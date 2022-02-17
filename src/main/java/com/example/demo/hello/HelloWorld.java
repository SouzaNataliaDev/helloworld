package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/hello")
public class HelloWorld {

@GetMapping
public String getHello1() {
	return  "Persistência e Atenção aos detalhes";
}
@GetMapping ("/hello2")
public String getHello2() {
	return "Responsabilidade pessoal e Proatividade";
}
}

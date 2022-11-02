package com.nttdata.bootstrap.webfluxappmicro;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/person-list-1")
	public Flux<Person> personlList1() {
		Person p1=new Person("Juan","Cruz",23);
		Flux<Person> fluxd=Flux.just(p1).delayElements(Duration.ofSeconds(6));
		return fluxd; 
	}

	@GetMapping("/person-list-2")
	public Flux<Person> personList2() {
		Person p1=new Person("Luis","Pineda",35);
		Flux<Person> fluxd=Flux.just(p1).delayElements(Duration.ofSeconds(6));
		return fluxd; 
	}
	@GetMapping("/person-list-3")
	public Flux<Person> personList3() {
		Person p1=new Person("Pepe","Moreno",43);
		Flux<Person> fluxd=Flux.just(p1).delayElements(Duration.ofSeconds(6));
		return fluxd; 
	}
	@GetMapping("/person-list-4")
	public Flux<Person> personList4() {
		Person p1=new Person("Sergio","Prados",32);
		Flux<Person> fluxd=Flux.just(p1).delayElements(Duration.ofSeconds(6));
		return fluxd; 
	}
	
	
	
	
}

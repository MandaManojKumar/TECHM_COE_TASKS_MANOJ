package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Shirt;
import com.example.repo.ShirtRepository;

import jakarta.validation.Valid;

@RestController
public class ShirtController {
	
	@Autowired
	private ShirtRepository repo;
	
	@GetMapping("/insert")
	public String insertData()
	{
		repo.save(new Shirt(1, "Red" , "Peter England", "M"));
		repo.save(new Shirt(2, "Black" , "Crocodile", "L"));
		repo.save(new Shirt(3, "Green" , "Rare rabbit", "M"));
		repo.save(new Shirt(4, "Maroon" , "U.S. Polo", "S"));
		System.out.println("Inserted Successfully");
		return "Inserted Successfully";
	}
	
	@PostMapping("/insertData")
	public Shirt createBook(@Valid @RequestBody Shirt shirt) {
	    return repo.save(shirt);
	}

}

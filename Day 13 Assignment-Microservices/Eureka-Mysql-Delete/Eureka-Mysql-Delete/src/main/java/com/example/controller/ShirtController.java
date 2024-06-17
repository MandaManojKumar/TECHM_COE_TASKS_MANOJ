package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//import com.example.model.Shirt;
import com.example.Repository.ShirtRepository;
//import com.example.model.Shirt;

@RestController
public class ShirtController {
	
	@Autowired
	private ShirtRepository repo;
	
	/*@GetMapping("/delete")
	public String deleteData()
	{
		repo.deleteById(1);
		System.out.println("Deleted Successfully");
		return "Deleted Successfully";
	}*/
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable(value = "id") int id) {
	    repo.deleteById(id);
	    System.out.println("Deleted Successfully");
	    //repo.delete(shirt);
	    return "Deleted Successfully";
	}
}
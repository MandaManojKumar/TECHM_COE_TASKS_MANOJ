package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Shirt;
//import com.example.model.Shirt;
import com.example.repo.ShirtRepository;

@RestController
public class ShirtController {
	
	@Autowired
	private ShirtRepository repo;
	
	@GetMapping("/select")
	public List<Shirt> selectData()
	{
		List <Shirt> shirt =(List<Shirt>) repo.findAll();
		for(Shirt s: shirt)
		{
			System.out.println(s);
		}
		System.out.println("Selected Successfully");
		
		return shirt;
	}
	
}
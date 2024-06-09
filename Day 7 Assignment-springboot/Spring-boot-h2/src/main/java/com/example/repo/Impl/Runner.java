package com.example.repo.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.Phone;
import com.example.repo.PhoneRepository;

@Component
public class Runner implements CommandLineRunner {

	@Autowired
	private PhoneRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Insert
		repo.save(new Phone("Samsung", "Galaxy","A23", 25000.00));
		repo.save(new Phone("Samsung", "Galaxy","M33", 45000.00));
		
		
		//Select a specific entity
		Optional <Phone> p=repo.findById(2);
		if(p.isPresent())
		{
			System.out.println(p.get());
		}
		else
		{
			System.out.println("No Data Found");
		}
		
		//Select All
		repo.findAll().forEach(System.out::println);
		
		//Delete
		repo.deleteById(1);
		
		//Select All
		repo.findAll().forEach(System.out::println);
	}

}


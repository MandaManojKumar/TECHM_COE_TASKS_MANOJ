package com.example.repo;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone,Integer>{
	
	//Optional<Phone> findByName(String name);

}

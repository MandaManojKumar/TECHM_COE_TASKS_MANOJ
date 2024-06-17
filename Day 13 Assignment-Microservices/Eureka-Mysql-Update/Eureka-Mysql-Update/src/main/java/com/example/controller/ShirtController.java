package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.model.Shirt;
import com.example.repo.ShirtRepository;

import java.util.Optional;

@RestController
@RequestMapping("/shirts")
public class ShirtController {

    @Autowired
    private ShirtRepository shirtRepository;

    @PutMapping("/update/{id}")
    public ResponseEntity<Shirt> updateShirt(@PathVariable int id, @RequestBody Shirt shirtDetails) {
        Optional<Shirt> optionalShirt = shirtRepository.findById(id);

        if (optionalShirt.isPresent()) {
            Shirt existingShirt = optionalShirt.get();
            existingShirt.setColor(shirtDetails.getColor());
            existingShirt.setBrand(shirtDetails.getBrand());
            existingShirt.setSize(shirtDetails.getSize());

            Shirt updatedShirt = shirtRepository.save(existingShirt);
            return new ResponseEntity<>(updatedShirt, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

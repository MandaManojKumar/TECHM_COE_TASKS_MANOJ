package com.example.curtainmodel.controller;

import com.example.curtainmodel.entity.Curtain;
import com.example.curtainmodel.service.CurtainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurtainController {

    @Autowired
    private CurtainService curtainService;

    @GetMapping("/curtains/byPrice")
    public List<Curtain> getCurtainsByPrice(@RequestParam int price) {
        return curtainService.findCurtainsByPrice(price);
    }

    @GetMapping("/curtains/byBrand")
    public List<Curtain> getCurtainsByBrand(@RequestParam String brand) {
        return curtainService.findCurtainsByBrand(brand);
    }
}

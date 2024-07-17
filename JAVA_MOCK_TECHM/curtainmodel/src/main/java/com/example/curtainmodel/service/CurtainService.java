package com.example.curtainmodel.service;

import com.example.curtainmodel.entity.Curtain;
import com.example.curtainmodel.repository.CurtainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurtainService {

    @Autowired
    private CurtainRepository curtainRepository;

    public List<Curtain> findCurtainsByPrice(int price) {
        return curtainRepository.getIdByPrice(price);
    }

    public List<Curtain> findCurtainsByBrand(String brand) {
        return curtainRepository.getIdByBrand(brand);
    }
}

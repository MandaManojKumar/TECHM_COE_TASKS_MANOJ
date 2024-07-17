package com.example.shipment_model.service;

import com.example.shipment_model.entity.Shipment;
import com.example.shipment_model.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    public Shipment getByTrackNo(String trackNo) {
        return shipmentRepository.findByTrackNo(trackNo);
    }

    public String deleteByShipId(Integer shipId) {
        if (shipmentRepository.existsById(shipId)) {
            shipmentRepository.deleteById(shipId);
            return "The requested shipId-" + shipId + " got deleted";
        } else {
            return "ShipId-" + shipId + " not found";
        }
    }
}

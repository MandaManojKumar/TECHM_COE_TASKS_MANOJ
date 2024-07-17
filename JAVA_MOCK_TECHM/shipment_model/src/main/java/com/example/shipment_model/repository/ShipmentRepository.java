package com.example.shipment_model.repository;

import com.example.shipment_model.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {

    Shipment findByTrackNo(String trackNo);

}

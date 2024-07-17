package com.example.shipment_model.controller;

import com.example.shipment_model.entity.Shipment;
import com.example.shipment_model.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @GetMapping("/{trackNo}")
    public ResponseEntity<?> getByTrackNo(@PathVariable String trackNo) {
        Shipment shipment = shipmentService.getByTrackNo(trackNo);
        if (shipment != null) {
            return ResponseEntity.ok(shipment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{shipId}")
    public ResponseEntity<?> deleteByShipId(@PathVariable Integer shipId) {
        String result = shipmentService.deleteByShipId(shipId);
        if (result.contains("deleted")) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(result);
        }
    }
}

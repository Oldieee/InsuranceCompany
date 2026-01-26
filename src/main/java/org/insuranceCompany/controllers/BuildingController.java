package org.insuranceCompany.controllers;

import jakarta.persistence.EntityNotFoundException;
import org.insuranceCompany.insurance.Building;
import org.insuranceCompany.services.BuildingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/buildings")
public class BuildingController {
    private  final BuildingService buildingService;
    public  BuildingController(BuildingService buildingService){
        this.buildingService=buildingService;

    }
    @PostMapping("/client/{clientId}")
    public ResponseEntity<?>createBuilding(@PathVariable Long clientId, @RequestBody Building building){
        try{
            Building savedBuilding=buildingService.createBuilding(clientId,building);
            return  new ResponseEntity<>(savedBuilding, HttpStatus.CREATED);
        }catch (EntityNotFoundException e){
            return  new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}

package org.insuranceCompany.controllers;

import jakarta.persistence.EntityNotFoundException;
import org.insuranceCompany.insurance.Building;
import org.insuranceCompany.services.BuildingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buildings")
public class BuildingController {
    private final BuildingService buildingService;

    public BuildingController(BuildingService buildingService) {
        this.buildingService = buildingService;

    }

    @PostMapping("/client/{clientId}")
    public ResponseEntity<?> createBuilding(@PathVariable Long clientId, @RequestBody Building building) {
        try {
            Building savedBuilding = buildingService.createBuilding(clientId, building);
            return new ResponseEntity<>(savedBuilding, HttpStatus.CREATED);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
        @GetMapping("/client/{clientId}")
        public ResponseEntity<List<Building>> getBuildingById(@PathVariable Long clientId){
        return  new ResponseEntity<>(buildingService.getBuildingsByClient(clientId),HttpStatus.OK);
        }

        @PutMapping("/{id}")
    public  ResponseEntity<?>updateBuilding(@PathVariable Long id ,@RequestBody Building building){
        try{Building updated=buildingService.updateBuilding(id,building);
            return new ResponseEntity<>(updated,HttpStatus.OK);
        }catch (EntityNotFoundException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }
    @DeleteMapping("/{id}")
        public  ResponseEntity<?>deleteBuilding(@PathVariable Long id){
        try{
            buildingService.deleteBuilding(id);
            return new ResponseEntity<>("Cladirea a fost stearsa",HttpStatus.OK);
        } catch (EntityNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
    }
    }


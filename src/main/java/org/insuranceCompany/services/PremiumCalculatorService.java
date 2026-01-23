package org.insuranceCompany.services;

import org.insuranceCompany.insurance.Building;
import org.insuranceCompany.repositories.BuildingRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PremiumCalculatorService {
    private  final BuildingRepository buildingRepository;

    public PremiumCalculatorService(BuildingRepository buildingRepository){
        this.buildingRepository=buildingRepository;
    }



      public BigDecimal calculatePrice(Building building){

        return building.getPrice().multiply(new BigDecimal("0.002"));


    }
}

package org.insuranceCompany.controllers;


import org.insuranceCompany.insurance.Building;
import org.insuranceCompany.repositories.PoliciesRepository;
import org.insuranceCompany.services.PremiumCalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {
    private  final PremiumCalculatorService premiumCalculatorService;
    public  PolicyController(PremiumCalculatorService premiumCalculatorService){
        this.premiumCalculatorService=premiumCalculatorService;
    }

    @PostMapping
    public  ResponseEntity<BigDecimal> calculatePrice(@RequestBody Building building){
        return  ResponseEntity.ok(premiumCalculatorService.calculatePrice(building));
    }

}

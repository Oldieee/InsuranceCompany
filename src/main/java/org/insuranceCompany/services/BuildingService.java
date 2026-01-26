package org.insuranceCompany.services;

import jakarta.persistence.EntityNotFoundException;
import org.insuranceCompany.insurance.Building;
import org.insuranceCompany.repositories.BuildingRepository;
import org.insuranceCompany.repositories.ClientRepository;
import org.insuranceCompany.users.Client;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {
   private final ClientRepository clientRepository;
    private final BuildingRepository buildingRepository;
    BuildingService(ClientRepository clientRepository,BuildingRepository buildingRepository){
        this.buildingRepository=buildingRepository;
        this.clientRepository=clientRepository;

    }

    public Building createBuilding(Long clientId, Building building){
        Client owner=clientRepository.findById(clientId)
                .orElseThrow(()->new EntityNotFoundException("Clientul nu a fost gasit"));
        building.setOwner(owner);
        return buildingRepository.save(building);
    }
}

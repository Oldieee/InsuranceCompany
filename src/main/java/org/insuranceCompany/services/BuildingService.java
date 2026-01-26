package org.insuranceCompany.services;

import jakarta.persistence.EntityNotFoundException;
import org.insuranceCompany.insurance.Building;
import org.insuranceCompany.repositories.BuildingRepository;
import org.insuranceCompany.repositories.ClientRepository;
import org.insuranceCompany.users.Client;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Building> getBuildingsByClient(Long clientId){
        return  buildingRepository.findByOwnerId(clientId);
    }
    public Building updateBuilding(Long id,Building updatedBuilding) {
                Building existingBuilding=buildingRepository.findById(id)
                        .orElseThrow(()->new EntityNotFoundException("Cladirea nu a fost gasita"));
                existingBuilding.setAddress(updatedBuilding.getAddress());
                existingBuilding.setPrice(updatedBuilding.getPrice());
                existingBuilding.setSurfaceArea(updatedBuilding.getSurfaceArea());
                return buildingRepository.save(existingBuilding);
    }
    public  void deleteBuilding(Long id){
        if(!buildingRepository.existsById(id))
            throw new EntityNotFoundException("Cladirea nu exista");
        buildingRepository.deleteById(id);
    }
}

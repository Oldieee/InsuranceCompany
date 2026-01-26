package org.insuranceCompany.repositories;

import org.insuranceCompany.insurance.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingRepository extends JpaRepository<Building,Long> {
    List<Building> findByOwnerId(Long ownerId);
}

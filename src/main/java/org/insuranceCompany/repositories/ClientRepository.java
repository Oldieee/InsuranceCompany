package org.insuranceCompany.repositories;

import org.insuranceCompany.users.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    boolean existsByFiscalCode(String fiscalCode);
    List<Client> findByNameContainingIgnoreCase(String name);
}

package org.insuranceCompany.repositories;

import org.insuranceCompany.users.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}

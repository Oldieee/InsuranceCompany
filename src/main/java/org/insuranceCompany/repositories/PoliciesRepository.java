package org.insuranceCompany.repositories;

import org.insuranceCompany.insurance.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliciesRepository  extends JpaRepository<Policy,Long> {
}

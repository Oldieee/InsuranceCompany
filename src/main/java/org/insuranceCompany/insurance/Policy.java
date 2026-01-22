package org.insuranceCompany.insurance;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.insuranceCompany.users.Broker;
import org.insuranceCompany.users.Client;

import java.math.BigDecimal;
import java.time.LocalDate;
@Setter
@Getter
public class Policy {
    private Long id;
    private Broker broker;
    private Client client;
    private Building building;
    private  String policyNumber;
    private LocalDate startDate,endDate;
    private BigDecimal price;



    public Policy(Broker broker, Client client, Building building, String policyNumber, LocalDate startDate, LocalDate endDate) {
        this.broker = broker;
        this.client = client;
        this.building = building;
        this.policyNumber = policyNumber;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}

package org.insuranceCompany.insurance;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.insuranceCompany.users.Broker;
import org.insuranceCompany.users.Client;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn
    private Broker broker;
    @ManyToOne
    @JoinColumn
    private Client client;
    @ManyToOne
    @JoinColumn
    private Building building;
    private  String policyNumber;
    private LocalDate startDate,endDate;
    private BigDecimal price;




}

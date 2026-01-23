package org.insuranceCompany.users;

import jakarta.persistence.*;
import lombok.*;
import org.insuranceCompany.insurance.Building;
import org.insuranceCompany.insurance.Policy;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Enumerated(EnumType.STRING)
    private  ClientType type;
    private  String name;
    private  String email;
    private  String phoneNumber;
    private  String address;
    private String fiscalCode;
    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "owner")
    private List<Building> buildings=new ArrayList<>();
    @ManyToOne
    private Broker broker;
    @OneToMany(mappedBy = "client")
    private List<Policy>policies=new ArrayList<>();




}

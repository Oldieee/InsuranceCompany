package org.insuranceCompany.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.insuranceCompany.insurance.Building;

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
    private  ClientType type;
    private  String name;
    private  String email;
    private  String phoneNumber;
    private  String address;
    private String fiscalCode;
    @Setter(AccessLevel.NONE)
    private List<Building> buildings=new ArrayList<>();




}

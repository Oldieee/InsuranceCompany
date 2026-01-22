package org.insuranceCompany.insurance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.insuranceCompany.geography.City;
import org.insuranceCompany.users.Client;

import java.math.BigDecimal;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Client owner;
    private City city;
    private  String address;
    private  int constructionYear;
    private BuildingType type;
    private  int floors;
    private int surfaceArea;
    private BigDecimal price;



}

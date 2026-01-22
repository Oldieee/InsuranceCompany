package org.insuranceCompany.insurance;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.insuranceCompany.geography.City;
import org.insuranceCompany.users.Client;

import java.math.BigDecimal;
@Getter
@Setter
public class Building {
    private Long id;
    private Client owner;
    private City city;
    private  String address;
    private  int constructionYear;
    private BuildingType type;
    private  int floors;
    private int surfaceArea;
    private BigDecimal price;


    public Building(Long id, Client owner, City city, String address, BuildingType type) {
        this.id = id;
        this.owner = owner;
        this.city = city;
        this.address = address;
        this.type = type;
    }
}

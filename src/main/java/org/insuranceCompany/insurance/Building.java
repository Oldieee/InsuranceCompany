package org.insuranceCompany.insurance;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.insuranceCompany.geography.City;
import org.insuranceCompany.users.Client;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@ManyToOne
    private Client owner;
@OneToMany(mappedBy = "building")
    private List<Policy> policy=new ArrayList<>();
@ManyToOne
@JoinColumn
    private City city;
    private  String address;
    private  int constructionYear;
    @Enumerated(EnumType.STRING)
    private BuildingType type;
    private  int floors;
    private int surfaceArea;
    private BigDecimal price;



}

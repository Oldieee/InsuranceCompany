package org.insuranceCompany.geography;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.insuranceCompany.insurance.Building;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private  String name;
    @ManyToOne
    @JoinColumn
    private County county;
    @Setter(AccessLevel.NONE)
@OneToMany(mappedBy = "city")
    private List<Building> buildings=new ArrayList<>();
}

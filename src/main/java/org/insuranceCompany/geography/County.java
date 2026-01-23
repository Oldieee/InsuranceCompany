package org.insuranceCompany.geography;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
public class County {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String name;
    @ManyToOne
    @JoinColumn
    private Country country;
    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "county")
    private List<City> cities=new ArrayList<>();

}

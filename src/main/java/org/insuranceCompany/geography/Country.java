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
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "country")
    private List<County> counties=new ArrayList<>();
}

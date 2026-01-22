package org.insuranceCompany.geography;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.insuranceCompany.insurance.Building;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter

public class City {
    private Long id;
    private  String name;

    private County county;
    @Setter(AccessLevel.NONE)
    private List<Building> buildings=new ArrayList<>();
}

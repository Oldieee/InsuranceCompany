package org.insuranceCompany.geography;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class County {
    private  String name;
    private Country country;
    @Setter(AccessLevel.NONE)
    private List<City> cities=new ArrayList<>();

}

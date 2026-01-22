package org.insuranceCompany.geography;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Country {
    private String name;
    @Setter(AccessLevel.NONE)
    private List<County> counties=new ArrayList<>();
}

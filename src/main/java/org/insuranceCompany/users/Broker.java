package org.insuranceCompany.users;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.insuranceCompany.insurance.Building;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Broker {
    private Long id;
    private  String name;
    private  String email;
    private  String password;
    private  String licenseCode;
    @Setter(AccessLevel.NONE)
    private  List<Client> clients=new ArrayList<>();





    public Broker(Long id, String name, String licenseCode) {
        this.id = id;
        this.name = name;
        this.licenseCode = licenseCode;
    }
}

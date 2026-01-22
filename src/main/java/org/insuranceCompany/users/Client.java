package org.insuranceCompany.users;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.insuranceCompany.insurance.Building;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Client {
    private  String id;
    private  ClientType type;
    private  String name;
    private  String email;
    private  String phoneNumber;
    private  String address;
    private String fiscalCode;
    @Setter(AccessLevel.NONE)
    private List<Building> buildings=new ArrayList<>();



    public Client(String id, ClientType type, String name, String fiscalCode) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.fiscalCode = fiscalCode;
    }
}

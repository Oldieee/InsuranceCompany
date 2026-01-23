package org.insuranceCompany.users;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.insuranceCompany.insurance.Building;

import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Broker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private  String email;
    private  String password;
    private  String licenseCode;
    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "broker")
    private  List<Client> clients=new ArrayList<>();





    public Broker(Long id, String name, String licenseCode) {
        this.id = id;
        this.name = name;
        this.licenseCode = licenseCode;
    }
}

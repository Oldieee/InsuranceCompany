package org.insuranceCompany.services;

import org.insuranceCompany.repositories.ClientRepository;
import org.insuranceCompany.users.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    public  ClientService(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
    }
 public Client createClient(Client client){
        if(client.getName()==null||client.getName().trim().isEmpty()){
            throw  new IllegalArgumentException("Numele Clientului este obligatoriu!");
        }
        if (clientRepository.existsByFiscalCode(client.getFiscalCode())){
            throw  new IllegalArgumentException("Exista deja un client cu acest cod Fiscal!");
        }
        return  clientRepository.save(client);
 }
 public List<Client>getAllClients(String name){
        if(name!=null&&!name.isEmpty()){
            return clientRepository.findByNameContainingIgnoreCase(name);
     }
        return clientRepository.findAll();
 }
}

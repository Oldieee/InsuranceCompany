package org.insuranceCompany.controllers;

import org.insuranceCompany.services.ClientService;
import org.insuranceCompany.users.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    private  final ClientService clientService;
        public ClientController(ClientService clientService){
            this.clientService=clientService;
        }
        @PostMapping
    public ResponseEntity<?>createClient(@RequestBody Client client){
            try{
                Client savedClient=clientService.createClient(client);
                return  new ResponseEntity<>(savedClient, HttpStatus.CREATED);
            }catch (IllegalArgumentException e) {

                return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
            }
        }
        @GetMapping
    public  ResponseEntity<List<Client>>getClients(@RequestParam(required = false) String name){
            List<Client> clients=clientService.getAllClients(name);
            return new ResponseEntity<>(clients,HttpStatus.OK);
        }
}

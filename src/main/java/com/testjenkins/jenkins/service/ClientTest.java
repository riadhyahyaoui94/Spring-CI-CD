package com.testjenkins.jenkins.service;

import com.testjenkins.jenkins.entities.Client;
import com.testjenkins.jenkins.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;


@Service
public class ClientTest {
    ClientRepository clientRepository;
    public ClientTest (ClientRepository repository) {
        this.clientRepository=repository;
    }

    @Test
    public void testAddClient() {

        Client client = new Client(null,"fatma","neji");
        List<Client>  clients= clientRepository.findAll();
        int listClientSize= clients.size();
        clientRepository.save(client);
        int expected=clientRepository.findAll().size();
        assertEquals(listClientSize+1,expected);
    }
}

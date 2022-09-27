package com.testjenkins.jenkins;

import com.testjenkins.jenkins.entities.Client;
import com.testjenkins.jenkins.repository.ClientRepository;
import lombok.NoArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

import static org.junit.Assert.assertEquals;


@SpringBootTest
@RunWith(SpringRunner.class)
@NoArgsConstructor
public class ClientServiceTest {
    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void testAddClient() {

        Client client = new Client(null,"fatma","neji");
        List<Client> clients= clientRepository.findAll();
        int listClientSize= clients.size();
        clientRepository.save(client);
        int expected=clientRepository.findAll().size();
        assertEquals(listClientSize+1,expected);
    }
}

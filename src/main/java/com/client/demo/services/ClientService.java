package com.client.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.demo.entities.Client;
import com.client.demo.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> findAll() {
		return clientRepository.findAll();
	}
	
	public Client findById(Long id) throws Exception {
		return clientRepository.findById(id).orElseThrow(()-> new 
				Exception ("Invalid Client Id"));
	}
	
	public void addClient(Client client) {
		clientRepository.save(client);
	}

}

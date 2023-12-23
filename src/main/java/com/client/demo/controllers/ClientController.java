package com.client.demo.controllers;
import com.client.demo.entities.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.client.demo.services.ClientService;

@RestController
@RequestMapping("api/client")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	@GetMapping
	public List<Client> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Client findById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
	
	@PostMapping
	public void save(@RequestBody Client client) {
		service.addClient(client);
	}
}

package com.study.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.study.crm.model.Client;
import com.study.crm.repository.ClientRepository;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired(required = true)
	private ClientRepository clientRepository;

	@GetMapping
	public List<Client> getAllClients() {

		return clientRepository.findAll();

	}
}

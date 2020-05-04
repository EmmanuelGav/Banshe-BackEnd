package com.project.banshee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.banshee.models.Client;
import com.project.banshee.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public List<Client> getAll() {
		return clientRepository.findAll();
	}

	public Client getById(Long id) {
		return clientRepository.getById(id);
	}
	public Optional<Client> getByNit(String nit) {
		return Optional.ofNullable(clientRepository.getByNit(nit));
	}
	
	public Client save(Client client) {
		return clientRepository.save(client);
	}
	
	public Client update(Client client) {
		return clientRepository.save(client);
	}

	public void delete(Long id) {
		clientRepository.deleteById(id);		
	}
}

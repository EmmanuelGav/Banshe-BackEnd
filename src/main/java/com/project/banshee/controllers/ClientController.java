package com.project.banshee.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.banshee.controllers.dtos.ClientDTO;
import com.project.banshee.controllers.exceptions.ControledException;
import com.project.banshee.models.Client;
import com.project.banshee.service.CityService;
import com.project.banshee.service.ClientService;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private ClientService clientService;
    
    @Autowired
    private CityService cityService;
    
	@GetMapping("all")
	List<Client> getAll() {
		return clientService.getAll();
	}

	@GetMapping("{id}")
	Client getByState(@PathVariable Long id) throws ControledException {
		Client client = clientService.getById(id);
		
		client.setCityId(client.getCity().getId());
		client.setStateId(client.getCity().getState().getId());
		client.setCountryId(client.getCity().getState().getCountry().getId());
		
		return client;
	}
	
	@PostMapping
	Client save(@Valid @RequestBody ClientDTO clientDTO) throws ControledException {
		Client client = modelMapper.map(clientDTO, Client.class);
		
		Optional<Client> existingClient = clientService.getByNit(client.getNit());
		if(existingClient.isPresent()) {
			throw new ControledException("The patient already has been registered.");
		}
		
		return clientService.save(client);
	}
	
	@PutMapping
	Client update(@Valid @RequestBody ClientDTO clientDTO) throws ControledException {
		Client client = modelMapper.map(clientDTO, Client.class);
		client.setCity(cityService.getById(clientDTO.getCityId()));
		Optional<Client> existingClient = clientService.getByNit(client.getNit());
		if(!existingClient.isPresent()) {
			throw new ControledException("The patient has not registered.");
		}
		
		return clientService.update(client);
	}

	@DeleteMapping("{id}")
	void delete(@PathVariable Long id) throws ControledException {
		clientService.delete(id);
	}
}

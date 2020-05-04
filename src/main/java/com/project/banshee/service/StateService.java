package com.project.banshee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.banshee.models.State;
import com.project.banshee.repositories.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;

	public List<State> getAll() {
		return stateRepository.findAll();
	}

	public State getById(Long id) {
		return stateRepository.getById(id);
	}

	public List<State> getByCountry(Long countryId) {
		return stateRepository.getByCountry(countryId);
	}
}

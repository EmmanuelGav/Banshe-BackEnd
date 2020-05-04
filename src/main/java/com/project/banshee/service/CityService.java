package com.project.banshee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.banshee.models.City;
import com.project.banshee.repositories.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;

	public List<City> getAll() {
		return cityRepository.findAll();
	}

	public City getById(Long id) {
		return cityRepository.getById(id);
	}

	public List<City> getByState(Long stateId) {
		return cityRepository.getByState(stateId);
	}
}

package com.project.banshee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.banshee.models.Country;
import com.project.banshee.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	public List<Country> getAll() {
		return countryRepository.findAll();
	}

	public Country getById(Long id) {
		return countryRepository.getById(id);
	}
}

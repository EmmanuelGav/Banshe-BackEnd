package com.project.banshee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.banshee.models.Country;
import com.project.banshee.service.CountryService;

@RestController
@RequestMapping("country")
public class CountryController {

    @Autowired
    private CountryService countryService;
    
	@GetMapping("all")
	List<Country> getAll() {
		return countryService.getAll();
	}
	
}

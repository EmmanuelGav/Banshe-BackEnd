package com.project.banshee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.banshee.controllers.exceptions.ControledException;
import com.project.banshee.models.City;
import com.project.banshee.service.CityService;

@RestController
@RequestMapping("city")
public class CityController {

    @Autowired
    private CityService cityService;
    
	@GetMapping("all")
	List<City> getAll() {
		return cityService.getAll();
	}
	
	@GetMapping("all/byState/{stateId}")
	List<City> getByState(@PathVariable Long stateId) throws ControledException {
		return cityService.getByState(stateId);
	}
}

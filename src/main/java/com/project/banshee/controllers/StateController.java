package com.project.banshee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.banshee.controllers.exceptions.ControledException;
import com.project.banshee.models.State;
import com.project.banshee.service.StateService;

@RestController
@RequestMapping("state")
public class StateController {

    @Autowired
    private StateService stateService;
    
	@GetMapping("all")
	List<State> getAll() {
		return stateService.getAll();
	}
	
	@GetMapping("all/byCountry/{countryId}")
	List<State> getByCountry(@PathVariable Long countryId) throws ControledException {
		return stateService.getByCountry(countryId);
	}
}

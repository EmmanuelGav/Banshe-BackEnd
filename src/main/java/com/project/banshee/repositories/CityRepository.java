package com.project.banshee.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.project.banshee.models.City;

@Service
public interface CityRepository extends JpaRepository<City, Long>{

    @Query("SELECT c FROM City c WHERE c.id = ?1")
	public City getById(Long id);

    @Query("SELECT c FROM City c WHERE c.state.id = ?1")
	public List<City> getByState(Long stateId);

}

package com.project.banshee.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.project.banshee.models.State;

@Service
public interface StateRepository extends JpaRepository<State, Long>{

    @Query("SELECT s FROM State s WHERE s.id = ?1")
	public State getById(Long id);

    @Query("SELECT s FROM State s WHERE s.country.id = ?1")
	public List<State> getByCountry(Long countryId);

}

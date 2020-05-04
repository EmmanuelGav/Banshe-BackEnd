package com.project.banshee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.project.banshee.models.Country;

@Service
public interface CountryRepository extends JpaRepository<Country, Long>{

    @Query("SELECT c FROM Country c WHERE c.id = ?1")
	public Country getById(Long id);

}

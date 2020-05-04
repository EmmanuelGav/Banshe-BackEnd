package com.project.banshee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.project.banshee.models.Client;

@Service
public interface ClientRepository extends JpaRepository<Client, Long>{

    @Query("SELECT c FROM Client c WHERE c.nit = ?1")
	public Client getByNit(String nit);
    
    @Query("SELECT c FROM Client c WHERE c.id = ?1")
	public Client getById(Long id);
}

package com.example.databasepostgres.repository;


import com.example.databasepostgres.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Long> {

}


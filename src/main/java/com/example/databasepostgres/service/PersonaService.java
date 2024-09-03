package com.example.databasepostgres.service;

import com.example.databasepostgres.model.Persona;
import com.example.databasepostgres.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;


    public Persona getPersonaById(Long id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        System.out.println(persona);
        return persona;
    }

    public Persona save(Persona persona) {
        Persona personaSaved = personaRepository.save(persona);
        return personaSaved;
    }


}

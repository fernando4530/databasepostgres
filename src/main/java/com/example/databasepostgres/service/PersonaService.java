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

    public Persona addPersona(Persona persona) {
        Persona personaSaved = personaRepository.save(persona);
        return personaSaved;
    }

    public String deletePersona(Long id) {
        Persona persona = personaRepository.findById(id).orElse(null);

        if (persona == null) {
            return "no se encontró usuario existente para eliminar";
        } else {
            personaRepository.deleteById(id);
            return "usuario eliminado con éxito";
        }
    }

}

package com.example.databasepostgres.controller;


import com.example.databasepostgres.model.Persona;
import com.example.databasepostgres.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping(value = "/persona/{id}")
    public Persona getPersona(@PathVariable Long id) {
        Persona persona = personaService.getPersonaById(id);
        return persona;
    }

    @PostMapping(value = "/persona")
    public Persona addPersona(@RequestBody Persona persona) {
        Persona personaSaved = personaService.save(persona);
        return personaSaved;
    }



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.persona.rest;

import com.example.persona.model.Persona;
import com.example.persona.service.PersonaService;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asunawesker
 */
@RestController
@RequestMapping("/personas")
public class PersonaREST {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping
    private ResponseEntity<List<Persona>> getAllPersonas(){
        try{
            return ResponseEntity.ok(personaService.findAll());
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }        
    }
    
    @PostMapping
    private ResponseEntity<Persona> savePersona(@RequestBody Persona persona){
        try{
            Persona personaGuardada = personaService.save(persona);
            return ResponseEntity.created(new URI("/personas/"+personaGuardada.getId())).body(personaGuardada);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
}

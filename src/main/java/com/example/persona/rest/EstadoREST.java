/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.persona.rest;

import com.example.persona.model.Estado;
import com.example.persona.service.EstadoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asunawesker
 */
@RestController
@RequestMapping("/estados")
public class EstadoREST {
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping("{id}")
    private ResponseEntity<List<Estado>> getEstadosById(@PathVariable("id") Long idPais){
        return ResponseEntity.ok(estadoService.findByCountry(idPais));
    }
}

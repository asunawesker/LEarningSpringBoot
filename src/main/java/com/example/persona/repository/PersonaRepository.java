/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.persona.repository;

import com.example.persona.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asunawesker
 */
//proporciona métodos relacionados con JPA, como vaciar el contexto de persistencia y eliminar registros en un lote
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}

package com.pieterandriesberg.petclinic.services;

import com.pieterandriesberg.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by pieterandries on 6-12-18.
 **/
public interface VetService {

    Vet findbyId(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}

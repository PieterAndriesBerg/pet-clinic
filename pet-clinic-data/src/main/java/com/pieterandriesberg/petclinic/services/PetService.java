package com.pieterandriesberg.petclinic.services;


import com.pieterandriesberg.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by pieterandries on 6-12-18
 **/
public interface PetService {

    Pet findbyId(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}

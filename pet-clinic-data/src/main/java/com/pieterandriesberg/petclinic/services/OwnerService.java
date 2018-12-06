package com.pieterandriesberg.petclinic.services;

import com.pieterandriesberg.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by pieterandries on 6-12-18
 **/
public interface OwnerService {

    Owner findbyLastName(String lastName);

    Owner findbyId(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}

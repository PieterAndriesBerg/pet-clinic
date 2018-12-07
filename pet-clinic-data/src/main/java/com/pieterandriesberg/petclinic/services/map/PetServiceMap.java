package com.pieterandriesberg.petclinic.services.map;

import com.pieterandriesberg.petclinic.model.Pet;
import com.pieterandriesberg.petclinic.services.CrudService;

import java.util.Set;

/**
 * Created by pieterandries on 7-12-18
 **/

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deletebyID(Long id) {
        super.deletebyId(id);
    }
}

package com.pieterandriesberg.petclinic.services.map;

import com.pieterandriesberg.petclinic.model.Vet;
import com.pieterandriesberg.petclinic.services.VetService;

import java.util.Set;

/**
 * Created by pieterandries on 7-12-18
 **/

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deletebyID(Long id) {
        super.deletebyId(id);
    }
}

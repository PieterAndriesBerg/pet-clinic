package com.pieterandriesberg.petclinic.services.map;

import com.pieterandriesberg.petclinic.model.Owner;
import com.pieterandriesberg.petclinic.services.CrudService;

import java.util.Set;

/**
 * Created by pieterandries on 7-12-18
 **/

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deletebyID(Long id) {
        super.deletebyId(id);
    }
}

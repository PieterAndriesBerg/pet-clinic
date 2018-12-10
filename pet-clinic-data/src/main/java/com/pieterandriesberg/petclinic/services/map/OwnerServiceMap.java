package com.pieterandriesberg.petclinic.services.map;

import com.pieterandriesberg.petclinic.model.Owner;
import com.pieterandriesberg.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by pieterandries on 7-12-18
 **/
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deletebyID(Long id) {
        super.deletebyId(id);
    }

    @Override
    public Owner findbyLastName(String lastName) {
        return null;
    }
}

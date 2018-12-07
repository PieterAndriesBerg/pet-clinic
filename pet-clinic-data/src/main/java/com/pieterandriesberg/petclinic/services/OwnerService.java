package com.pieterandriesberg.petclinic.services;

import com.pieterandriesberg.petclinic.model.Owner;



/**
 * Created by pieterandries on 6-12-18
 **/
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findbyLastName(String lastName);

}

package com.pieterandriesberg.petclinic.services;

import java.util.Set;

/**
 * Created by pieterandries on 7-12-18
 **/


public interface CrudService<T, ID> {
//our standard crud service (create, read, update , delete)

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deletebyID(ID id);

}

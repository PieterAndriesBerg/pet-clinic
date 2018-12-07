package com.pieterandriesberg.petclinic.model;

import java.io.Serializable;

/**
 * Created by pieterandries on 7-12-18
 **/

public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}

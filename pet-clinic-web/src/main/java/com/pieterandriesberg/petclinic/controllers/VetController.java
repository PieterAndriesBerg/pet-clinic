package com.pieterandriesberg.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pieterandries on 7-12-18
 **/
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets() {

        return "vets/index";
    }
}

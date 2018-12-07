package com.pieterandriesberg.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pieterandries on 7-12-18
 **/
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/","/index","/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}

package com.dhusepetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"/","index","index.html","home"})
    public String getIndex(){

        return "index";
    }
}

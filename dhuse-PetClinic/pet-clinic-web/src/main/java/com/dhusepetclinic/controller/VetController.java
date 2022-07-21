package com.dhusepetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/vet")
@Controller
public class VetController {


    @GetMapping(value = {"","/","/index","index.html"})
    public String getVetIndex(){

        return "vet/index";
    }
}

package com.dhusepetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/owner")
@Controller
public class OwnerController {


    @GetMapping(value = {"","/","/index","index.html"})
    public String getOwnerIndex(){

        return "owner/index";
    }
}

package com.dhusepetclinic.service;

import com.dhusepetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CurdService<Vet, Integer> {


    Vet findByLastName(String lastName);

}

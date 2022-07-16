package com.dhusepetclinic.model.services;

import com.dhusepetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet findByLastName(String lastName);

    Vet save(Vet owner);

    Set<Vet> findAll();
}

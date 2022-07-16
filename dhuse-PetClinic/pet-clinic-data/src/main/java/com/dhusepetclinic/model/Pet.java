package com.dhusepetclinic.model;

import java.io.Serializable;

public class Pet extends BaseEntity {

    private Owner owner;
    private PetType petType;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }
}

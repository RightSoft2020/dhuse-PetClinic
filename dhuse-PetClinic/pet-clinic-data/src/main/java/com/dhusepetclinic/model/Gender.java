package com.dhusepetclinic.model;

public enum Gender {
    MALE("Male"),FEMALE("Female");
    private String genderValue;

    Gender(String genderValue) {
        this.genderValue = genderValue;
    }
}

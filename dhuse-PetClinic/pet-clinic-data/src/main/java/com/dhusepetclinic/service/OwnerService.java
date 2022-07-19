package com.dhusepetclinic.service;

import com.dhusepetclinic.model.Owner;

import java.util.Set;

public interface OwnerService  extends CurdService<Owner,Integer>{

    Owner findByLastName(String lastName);
}

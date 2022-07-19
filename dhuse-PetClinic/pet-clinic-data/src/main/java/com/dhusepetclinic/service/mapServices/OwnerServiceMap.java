package com.dhusepetclinic.service.mapServices;

import com.dhusepetclinic.model.Owner;
import com.dhusepetclinic.service.CurdService;

import java.util.Set;

public class OwnerServiceMap  extends AbstractMapService<Owner,Integer> implements CurdService<Owner,Integer> {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }
}
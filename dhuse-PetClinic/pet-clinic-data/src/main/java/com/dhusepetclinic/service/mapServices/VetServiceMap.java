package com.dhusepetclinic.service.mapServices;

import com.dhusepetclinic.model.Vet;
import com.dhusepetclinic.service.CurdService;

import java.util.Set;


public class VetServiceMap extends AbstractMapService<Vet,Integer> implements CurdService<Vet,Integer> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Vet findById(Integer id) {
        return super.findById(id);
    }
}

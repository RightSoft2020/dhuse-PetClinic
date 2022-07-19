package com.dhusepetclinic.service.mapServices;

import com.dhusepetclinic.model.Pet;
import com.dhusepetclinic.service.CurdService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Integer>  implements CurdService<Pet,Integer> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }
}

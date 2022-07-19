package com.dhusepetclinic.service;

import java.util.Set;

public interface CurdService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(T object);

}

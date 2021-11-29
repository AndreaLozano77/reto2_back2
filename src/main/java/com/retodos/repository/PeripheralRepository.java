/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.retodos.repository;

import com.retodos.model.Peripheral;
import com.retodos.repository.crud.PeripheralCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andrea Lozano Cataño
 */
@Repository
public class PeripheralRepository {
    
    @Autowired
    private PeripheralCrudRepository crudRepository;
    
    public Peripheral create(Peripheral peripheral) {
        return crudRepository.save(peripheral);
    }

    public void update(Peripheral Peripheral) {
        crudRepository.save(Peripheral);
    }

    public List< Peripheral> getAll() {
        return crudRepository.findAll();
    }

    public Optional<Peripheral> getById(String id) {
        return crudRepository.findById(id);
    }

    public void delete(Peripheral Peripheral) {
        crudRepository.delete(Peripheral);
    }
}

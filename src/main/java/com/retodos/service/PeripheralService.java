/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.retodos.service;

import com.retodos.model.Peripheral;
import com.retodos.repository.PeripheralRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andrea Lozano Cataño
 */
@Service
public class PeripheralService {
    
    @Autowired
    private PeripheralRepository repository;
    
    public List<Peripheral> getAll() {
        return this.repository.getAll();
    }
    
    public Optional<Peripheral> getById(String id) {
        return this.repository.getById(id);
    }
    
    public Peripheral create(Peripheral peripheral) {
        return repository.create(peripheral);
    }
    
    public Peripheral update(Peripheral peripheral) {

        if (peripheral.getReference() != null) {
            Optional<Peripheral> peripheralDb = repository.getById(peripheral.getReference());
            if (!peripheralDb.isEmpty()) {
                if (peripheral.getBrand()!= null) {
                    peripheralDb.get().setBrand(peripheral.getBrand());
                }
                if (peripheral.getCategory() != null) {
                    peripheralDb.get().setCategory(peripheral.getCategory());
                }
                if (peripheral.getDescription() != null) {
                    peripheralDb.get().setDescription(peripheral.getDescription());
                }
                if (peripheral.getPrice() != 0.0) {
                    peripheralDb.get().setPrice(peripheral.getPrice());
                }
                if (peripheral.getQuantity() != 0) {
                    peripheralDb.get().setQuantity(peripheral.getQuantity());
                }
                if (peripheral.getPhotography()!= null) {
                    peripheralDb.get().setPhotography(peripheral.getPhotography());
                }
                repository.update(peripheralDb.get());
                return peripheralDb.get();
            } else {
                return peripheral;
            }
        } else {
            return peripheral;
        }
    }
    
    public boolean delete(String id) {
        Boolean aBoolean = getById(id).map(peripheral -> {
            repository.delete(peripheral);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}

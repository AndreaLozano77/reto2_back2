/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.retodos.controller;

import com.retodos.model.Peripheral;
import com.retodos.service.PeripheralService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andrea Lozano Cataño
 */
@RestController
@RequestMapping("/api/peripherals")
@CrossOrigin("*")
public class PeripheralController {
    
    @Autowired
    private PeripheralService service;
    
    @GetMapping("/all")
    public List<Peripheral> getAll(){
        return service.getAll();
    }
    
    @GetMapping("/{id}")
    public Peripheral getById(@PathVariable("id") String id) {
        return service.getById(id).get();
    }
    
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Peripheral create(@RequestBody Peripheral peripheral) {
        return service.create(peripheral);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Peripheral update(@RequestBody Peripheral peripheral) {
        return service.update(peripheral);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") String id) {
        return service.delete(id);
    }
}

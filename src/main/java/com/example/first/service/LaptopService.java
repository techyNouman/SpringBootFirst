package com.example.first.service;

import com.example.first.model.Laptop;
import com.example.first.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repository;

    public void addLaptop(Laptop laptop) {
        System.out.println("Laptop added...");
        repository.save(laptop);
    }

    public boolean isGoodForProgramming(Laptop laptop){
        return true;
    }
}

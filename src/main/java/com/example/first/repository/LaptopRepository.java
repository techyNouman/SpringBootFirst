package com.example.first.repository;

import com.example.first.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop){
        System.out.println("Saved in database...");
    }
}

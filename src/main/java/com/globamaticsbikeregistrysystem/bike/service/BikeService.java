package com.globamaticsbikeregistrysystem.bike.service;

import com.globamaticsbikeregistrysystem.bike.Repository.BikeRepository;
import com.globamaticsbikeregistrysystem.bike.model.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BikeService {


    @Autowired
    private BikeRepository bikeRepository;


    public List<Bike> getBike()
    {
        return bikeRepository.findAll();
    }

    public Bike postBike( Bike bike)
    {
        return bikeRepository.save(bike);
    }

}

package com.globamaticsbikeregistrysystem.bike.controllers;


import com.globamaticsbikeregistrysystem.bike.Repository.BikeRepository;
import com.globamaticsbikeregistrysystem.bike.model.Bike;
import com.globamaticsbikeregistrysystem.bike.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class BikesController {

    @Autowired
    private BikeRepository bikeRepository;
    @Autowired
    private BikeService bikeService;

    @GetMapping(path = "bike")
    public List<Bike> listBike()
    {
       return  bikeService.getBike();
    }

    @PostMapping(path = "postbike")
    public  void createBike(@RequestBody  Bike bike)
    {
        bikeService.postBike(bike);
    }




}

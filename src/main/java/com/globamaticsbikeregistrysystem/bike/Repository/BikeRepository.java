package com.globamaticsbikeregistrysystem.bike.Repository;

import com.globamaticsbikeregistrysystem.bike.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends  JpaRepository<Bike,Long> {


}

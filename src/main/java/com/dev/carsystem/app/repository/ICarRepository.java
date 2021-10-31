package com.dev.carsystem.app.repository;

import com.dev.carsystem.app.models.entity.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarRepository extends CrudRepository<Car, Long> {
}

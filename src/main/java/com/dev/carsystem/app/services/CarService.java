package com.dev.carsystem.app.services;

import com.dev.carsystem.app.models.entity.Car;
import com.dev.carsystem.app.repository.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private ICarRepository carRepository;

    public List<Car> getAll() {
        return (List<Car>) carRepository.findAll();
    }

}

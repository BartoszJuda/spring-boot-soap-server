package com.soap.springbootsoapserver.service;


import com.soap.springbootsoapserver.CarsDB.CarEntity;
import com.soap.springbootsoapserver.CarsDB.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3._2001.xmlschema.Car;


@Service
public class CarService {

    @Autowired
    private CarsRepository carsRepository;
    private Car car;


    public Car getCar(String model){
        CarEntity carEntity = carsRepository.getCarEntityByModel(model);
        Car car = new Car();
        car.setCarId(carEntity.getCarId());
        car.setModel(carEntity.getModel());
        car.setColor(carEntity.getColor());
        car.setHorsePower(carEntity.getHorsePower());
        car.setPrice(carEntity.getPrice());
        return car;
    }
}

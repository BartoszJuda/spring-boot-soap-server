package com.soap.springbootsoapserver.CarsDB;

import org.w3._2001.xmlschema.Car;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carId;

    @NotNull
    @Size(max = 20)
    private String model;

    @NotNull
    private double horsePower;

    @NotNull
    private double price;

    @NotNull
    private String color;

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "carId=" + carId +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

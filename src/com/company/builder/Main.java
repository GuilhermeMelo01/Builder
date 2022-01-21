package com.company.builder;

import com.company.builder.builders.CarBuilder;
import com.company.builder.builders.TruckBuilder;
import com.company.builder.cars.Car;
import com.company.builder.cars.Truck;
import com.company.builder.director.Director;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        //Criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println(truck.result() + " Fabricado com sucesso!");
    }
}

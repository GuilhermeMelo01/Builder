package com.company.builder.builders;

import com.company.builder.components.CarType;
import com.company.builder.components.Engine;
import com.company.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}

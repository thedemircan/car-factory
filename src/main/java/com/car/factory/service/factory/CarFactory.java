package com.car.factory.service.factory;

import com.car.factory.model.enums.CarType;
import com.car.factory.service.CabrioService;
import com.car.factory.service.HatchbackService;
import com.car.factory.service.SedanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarFactory {

    private final CabrioService cabrioService;
    private final SedanService sedanService;
    private final HatchbackService hatchbackService;

    public CarService handle(CarType carType) {
        if (carType.equals(CarType.CABRIO)) {
            return cabrioService;
        }
        if (carType.equals(CarType.SEDAN)) {
            return sedanService;
        }
        return hatchbackService;
    }
}

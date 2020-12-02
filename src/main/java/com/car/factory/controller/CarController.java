package com.car.factory.controller;

import com.car.factory.model.enums.CarType;
import com.car.factory.service.factory.CarFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {

    private final CarFactory carFactory;

    @GetMapping
    public String getType(@RequestParam(name = "carType") CarType carType) {
        return carFactory.handle(carType).getType();
    }
}

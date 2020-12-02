package com.car.factory.service;

import com.car.factory.service.factory.CarService;
import org.springframework.stereotype.Service;

@Service
public class SedanService implements CarService {

    @Override
    public String getType() {
        return "Sedan Car has produced.";
    }
}

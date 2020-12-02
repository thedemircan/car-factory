package com.car.factory.service;

import com.car.factory.service.factory.CarService;
import org.springframework.stereotype.Service;

@Service
public class HatchbackService implements CarService {

    @Override
    public String getType() {
        return "Hatchback Car has produced.";
    }
}

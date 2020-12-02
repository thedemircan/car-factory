package com.car.factory.service;

import com.car.factory.service.factory.CarService;
import org.springframework.stereotype.Service;

@Service
public class CabrioService implements CarService {

    @Override
    public String getType() {
        return "Cabrio Car has produced.";
    }
}

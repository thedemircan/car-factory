package com.car.factory.service.factory;

import com.car.factory.model.enums.CarType;
import com.car.factory.service.CabrioService;
import com.car.factory.service.SedanService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CarFactoryTest {

    @InjectMocks
    private CarFactory carFactory;

    @Mock
    private CabrioService cabrioService;

    @Mock
    private SedanService sedanService;

    @Test
    public void it_should_return_cabrio_service_when_car_type_is_cabrio() {
        // When
        CarService carService = carFactory.handle(CarType.CABRIO);

        // Then
        assertThat(carService).isInstanceOf(cabrioService.getClass());
    }

    @Test
    public void it_should_return_sedan_service_when_car_type_is_sedan() {
        // When
        CarService carService = carFactory.handle(CarType.SEDAN);

        // Then
        assertThat(carService).isInstanceOf(sedanService.getClass());
    }
}
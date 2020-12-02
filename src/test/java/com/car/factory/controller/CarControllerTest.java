package com.car.factory.controller;

import com.car.factory.model.enums.CarType;
import com.car.factory.service.factory.CarFactory;
import com.car.factory.service.factory.CarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = CarController.class)
public class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CarFactory carFactory;

    @Test
    public void it_should_get_type() throws Exception {
        // Given
        CarService carService = mock(CarService.class);
        when(carFactory.handle(CarType.CABRIO)).thenReturn(carService);

        when(carService.getType()).thenReturn("Car Service Return Value");

        // When
        ResultActions resultActions = mockMvc.perform(get("/cars").param("carType", "CABRIO"));

        // Then
        resultActions.andExpect(status().isOk());
        resultActions.andExpect(content().string("Car Service Return Value"));
    }
}
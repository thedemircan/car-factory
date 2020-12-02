package com.car.factory.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class HatchbackServiceTest {

    @InjectMocks
    private HatchbackService hatchbackService;

    @Test
    public void it_should_get_type() {
        // When
        String response = hatchbackService.getType();

        // Then
        assertThat(response).isEqualTo("Hatchback Car has produced.");
    }

}
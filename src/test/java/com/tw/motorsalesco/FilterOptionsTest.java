package com.tw.motorsalesco;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FilterOptionsTest {
    @Test
    public void getBrandFilterOptions_ReturnsFilterOptions() {
        Map<String, Integer> mockOptions = new HashMap<>();
        mockOptions.put("Suzuki", 3);
        mockOptions.put("Tesla", 2);
        mockOptions.put("Lada", 1);

//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car(1, ))
//        FilterOptions sut = new FilterOptions();
//
//
//        var result = sut.getBrandFilterOptions();
//
//        assertEquals(result, mockOptions);


    }
}

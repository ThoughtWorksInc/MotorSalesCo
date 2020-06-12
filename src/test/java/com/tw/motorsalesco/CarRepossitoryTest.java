package com.tw.motorsalesco;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarRepossitoryTest {
    @Test
    void shouldReturnListOfBrandNames() {
        var sut = new CarRepository();
        List<String> expected = Arrays.asList("Suzuki", "Lada", "Tesla");
        var result = sut.findBrands();
        assertEquals(expected, result);

    }

    @Test
    void shouldReturnQuantityOfBrandNames() {
        Map<String, Integer> brandValue = new HashMap<>();
        var sut = new CarRepository();
        brandValue = sut.findBrandValues();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("");
    }
}

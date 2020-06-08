package com.tw.motorsalesco;

import java.util.Arrays;
import java.util.List;

public class CarRepository {
    public List<Car> findAll() {
        return Arrays.asList(
                new Car("Suzuki", "swift glx", 2005, 2000),
                new Car("Lada", "1200", 1990, 1000),
                new Car("Tesla", "s", 2019, 54000)
        );
    }
}

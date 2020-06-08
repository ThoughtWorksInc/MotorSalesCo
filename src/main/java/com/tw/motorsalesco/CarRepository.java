package com.tw.motorsalesco;

import java.util.Arrays;
import java.util.List;

public class CarRepository {

    public static final String MANUAL = "manual";
    public static final String AUTO = "auto";
    public static final String N_A = "N/A";

    public List<Car> findAll() {
        return Arrays.asList(
                new Car(1L, "Suzuki", "swift glx", 2005, 2000, false, "Perfect condition", "Gas", 200_233, AUTO),
                new Car(2L, "Lada", "1200", 1990, 1000, false, "Perfect condition", "Gas", 400_233, MANUAL),
                new Car(3L, "Tesla", "s", 2020, 54000, true, "The best car ever...", "Electric", 200_233, N_A)
        );
    }
}

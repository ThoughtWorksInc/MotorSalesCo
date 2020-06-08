package com.tw.motorsalesco;

public class Car {
    private final long id;
    private final String brand;
    private final String model;
    private final int year;
    private final int price;
    private final boolean status;
    private final String description;
    private final String fuelType;
    private final int mileage;
    private final String transmissionType;

    public Car(long id, String brand, String model, int year, int price, boolean status, String description, String fuelType, int mileage, String transmissionType) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.status = status;
        this.description = description;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.transmissionType = transmissionType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public long getId() {
        return id;
    }

    public boolean isStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getMileage() {
        return mileage;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
}

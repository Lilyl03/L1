package com.company.d11.vehicle;

public class SafeVehicle {
    private final VehicleType type;
    private final int year;

    public SafeVehicle(VehicleType type, int year) {
        this.type = type;
        this.year = year;
    }

    public static void main(String[] args) {
        new SafeVehicle(VehicleType.BUS, 2022);
    }
}

package property.impl;

import property.Detail;

import java.math.BigDecimal;

public class Battery extends Detail {
    private final int batteryCapacity;
    private static final String CAPACITY_MEASURE = "W*h";

    public Battery(String name, BigDecimal price, int batteryCapacity) {
        this.name = name;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
    }

    public String getDescription() {
        return String.format("%s: Battery capacity-%s%s, Price-%.2f%s",
                name, batteryCapacity, CAPACITY_MEASURE, price, CURRENCY);
    }
}

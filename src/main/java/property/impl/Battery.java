package property.impl;

import property.Property;

import java.math.BigDecimal;

public class Battery extends Property {
    int batteryCapacity;

    public Battery(String name, BigDecimal price, int batteryCapacity) {
        this.name = name;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
    }

    public String getDescription() {
        return "";
    }
}

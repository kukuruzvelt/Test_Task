package property.impl;

import property.Property;

import java.math.BigDecimal;

public class PowerUnit extends Property {
    int power;

    public PowerUnit(String name, BigDecimal price, int power) {
        this.name = name;
        this.price = price;
        this.power = power;
    }

    public String getDescription() {
        return "";
    }
}

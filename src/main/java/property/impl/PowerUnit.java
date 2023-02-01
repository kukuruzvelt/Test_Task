package property.impl;

import property.Detail;

import java.math.BigDecimal;

public class PowerUnit extends Detail {
    private final int power;
    private static final String POWER_MEASURE = "V";

    public PowerUnit(String name, BigDecimal price, int power) {
        this.name = name;
        this.price = price;
        this.power = power;
    }

    public String getDescription() {
        return String.format("%s: Power-%s%s, Price-%.2f%s",
                name, power, POWER_MEASURE, price, CURRENCY);
    }
}

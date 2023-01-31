package property.impl;

import property.Property;

import java.math.BigDecimal;

public class Processor extends Property {
    String ram;
    int processorCount;

    public Processor(String name, BigDecimal price, String ram, int processorCount) {
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.processorCount = processorCount;
    }

    public String getDescription() {
        return "";
    }
}

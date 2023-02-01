package property.impl;

import property.Detail;

import java.math.BigDecimal;

public class Processor extends Detail {
    private final String ramSize;
    private final int processorCount;
    private static final String RAM_MEASURE = "GB";

    public Processor(String name, BigDecimal price, String ramSize, int processorCount) {
        this.name = name;
        this.price = price;
        this.ramSize = ramSize;
        this.processorCount = processorCount;
    }

    public String getDescription() {
        return String.format("%s: RAM-%s%s, Processor count-%s ,Price-%.2f%s",
                name, ramSize, RAM_MEASURE, processorCount, price, CURRENCY);
    }
}

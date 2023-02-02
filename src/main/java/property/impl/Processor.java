package property.impl;

import property.Detail;

import java.math.BigDecimal;

public class Processor extends Detail {
    private final BigDecimal CPUFrequency;
    private final int processorCount;
    private static final String FREQUENCY_MEASURE = "GHz";

    public Processor(String name, BigDecimal price, BigDecimal CPUFrequency, int processorCount) {
        this.name = name;
        this.price = price;
        this.CPUFrequency = CPUFrequency;
        this.processorCount = processorCount;
    }

    public String getDescription() {
        return String.format("%s: RAM-%s%s, CPU Frequency-%s ,Price-%.2f%s",
                name, CPUFrequency, FREQUENCY_MEASURE, processorCount, price, CURRENCY);
    }
}

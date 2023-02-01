package property.impl;

import property.Detail;

import java.math.BigDecimal;

public class VideoCard extends Detail {
    private final int graphicsCardRamSize;
    private final int memorySpeed;
    private static final String RAM_MEASURE = "GB";
    private static final String MEMORY_SPEED_MEASURE = "MHz";

    public VideoCard(String name, BigDecimal price, int memorySpeed, int graphicsCardRamSize){
        this.name = name;
        this.price = price;
        this.memorySpeed = memorySpeed;
        this.graphicsCardRamSize = graphicsCardRamSize;
    }

    public String getDescription() {
        return String.format("%s: Graphics Card RAM-%s%s, Memory speed-%s %s ,Price-%.2f%s",
                name, graphicsCardRamSize, RAM_MEASURE, memorySpeed, MEMORY_SPEED_MEASURE,
                price, CURRENCY);
    }
}

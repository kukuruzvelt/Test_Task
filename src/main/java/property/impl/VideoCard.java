package property.impl;

import property.Property;

import java.math.BigDecimal;

public class VideoCard extends Property {
    int graphicsCardRamSize;
    int memorySpeed;

    public VideoCard(String name, BigDecimal price, int memorySpeed, int graphicsCardRamSize){
        this.name = name;
        this.price = price;
        this.memorySpeed = memorySpeed;
        this.graphicsCardRamSize = graphicsCardRamSize;
    }

    public String getDescription() {
        return "";
    }
}

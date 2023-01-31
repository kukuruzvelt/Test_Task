package property.impl;

import property.Property;

import java.math.BigDecimal;

public class Screen extends Property {
    int diagonal;
    int screenRefreshRate;

    public Screen(String name, BigDecimal price, int diagonal, int screenRefreshRate) {
        this.name = name;
        this.price = price;
        this.diagonal = diagonal;
        this.screenRefreshRate = screenRefreshRate;
    }

    public String getDescription() {
        return "";
    }
}

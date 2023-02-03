package property.impl;

import property.Detail;

import java.math.BigDecimal;

public class Screen extends Detail {
    private final BigDecimal diagonal;
    private final int screenRefreshRate;
    private static final String DIAGONAL_MEASURE = "Inches";
    private static final String REFRESH_RATE_MEASURE = "Hz";

    public Screen(String name, BigDecimal price, BigDecimal diagonal, int screenRefreshRate) {
        this.name = name;
        this.price = price;
        this.diagonal = diagonal;
        this.screenRefreshRate = screenRefreshRate;
    }

    public String getDescription() {
        return String.format("%s: Diagonal - %s %s, Screen refresh rate - %s%s, Price - %.2f%s",
                name, diagonal, DIAGONAL_MEASURE, screenRefreshRate, REFRESH_RATE_MEASURE,
                price, CURRENCY);
    }
}

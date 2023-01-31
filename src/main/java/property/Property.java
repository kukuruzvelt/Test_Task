package property;

import java.math.BigDecimal;

public abstract class Property {
    protected String name;
    protected BigDecimal price;

    public abstract String getDescription();

    public BigDecimal getPrice(){
        return price;
    }
}

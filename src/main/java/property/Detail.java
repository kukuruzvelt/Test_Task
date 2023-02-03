package property;

import java.math.BigDecimal;

public abstract class Detail {
    protected String name;
    protected BigDecimal price;
    protected final String CURRENCY = "$";

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}

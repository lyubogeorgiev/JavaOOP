package Ex05Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    public static final double COFFEE_MILLILITERS = 50;
    public static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    private final double caffeine;
    public Coffee(String name, BigDecimal price, double milliliters, double caffeine) {
        super(name, price, milliliters);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }
}

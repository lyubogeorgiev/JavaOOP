package Ex04PizzaCalories;

public enum ToppingModifiers {
    Meat(1.2),
    Veggies(0.8),
    Cheese(1.1),
    Sauce(0.9);

    private final double index;

    ToppingModifiers(double index) {
        this.index = index;
    }

    public double getIndex() {
        return this.index;
    }
}

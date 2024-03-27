package Ex04PizzaCalories;

public enum DoughModifiers {
    White(1.5),
    Wholegrain(1.0),
    Crispy(0.9),
    Chewy(1.1),
    Homemade(1.0);

    private final double index;

    DoughModifiers(double index) {
        this.index = index;
    }

    public double getIndex() {
        return this.index;
    }
}

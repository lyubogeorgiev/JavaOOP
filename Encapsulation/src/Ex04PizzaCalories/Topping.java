package Ex04PizzaCalories;

import java.util.Arrays;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight){
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (Arrays.stream(ToppingModifiers.values()).noneMatch(t -> t.name().equals(toppingType))) {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }

        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        return (2 * this.weight) * ToppingModifiers.valueOf(this.toppingType).getIndex();
    }

    @Override
    public String toString() {
        return "Topping{" +
                "toppingType='" + toppingType + '\'' +
                ", weight=" + weight +
                '}';
    }
}

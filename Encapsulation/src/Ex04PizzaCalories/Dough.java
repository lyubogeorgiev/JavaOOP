package Ex04PizzaCalories;

import java.util.Arrays;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setWeight(weight);
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        if (Arrays.stream(DoughModifiers.values()).noneMatch(t -> t.name().equals(flourType))) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (Arrays.stream(DoughModifiers.values()).noneMatch(t -> t.name().equals(bakingTechnique))) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

        this.bakingTechnique = bakingTechnique;
    }

    public double calculateCalories() {
        return (2 * this.weight)
                * DoughModifiers.valueOf(this.flourType).getIndex()
                * DoughModifiers.valueOf(this.bakingTechnique).getIndex();
    }

    @Override
    public String toString() {
        return "Dough{" +
                "flourType='" + flourType + '\'' +
                ", bakingTechnique='" + bakingTechnique + '\'' +
                ", weight=" + weight +
                '}';
    }
}

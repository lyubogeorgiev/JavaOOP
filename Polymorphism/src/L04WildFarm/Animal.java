package L04WildFarm;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.setAnimalName(animalName);
        this.setAnimalType(animalType);
        this.setAnimalWeight(animalWeight);
        this.setFoodEaten(0);
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    abstract void makeSound();
    abstract void eat(Food food);
}

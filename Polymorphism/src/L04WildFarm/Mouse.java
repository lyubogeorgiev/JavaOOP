package L04WildFarm;

import java.text.DecimalFormat;

public class Mouse extends Mammal{
    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    void eat(Food food) {
        if (food.getClass().getSimpleName().equals("Meat")) {
            throw new IllegalArgumentException("Cats are not eating that type of food!");
        }

        this.setFoodEaten(food.getQuantity());
    }


}

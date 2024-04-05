package L04WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Food food = new Meat(4);

//        System.out.println(food.getClass().getSimpleName());

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputAnimal = input.split("\\s+");

            String animalType = inputAnimal[0];
            String animalName = inputAnimal[1];
            Double animalWeight = Double.parseDouble(inputAnimal[2]);
            String animalLivingRegion = inputAnimal[3];

            String[] inputFood = scanner.nextLine().split("\\s+");

            String foodName = inputFood[0];
            Integer foodQuantity = Integer.parseInt(inputFood[1]);

            Food food;
            if (foodName.equals("Vegetable")) {
                food = new Vegetable(foodQuantity);
            } else {
                food = new Meat(foodQuantity);
            }

            switch (animalType) {
                case "Mouse":

                    Mouse mouse = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                    mouse.makeSound();

                    try {
                        mouse.eat(food);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println(mouse);
                    break;
                case "Zebra":
                    Zebra zebra = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                    zebra.makeSound();

                    try {
                        zebra.eat(food);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println(zebra);
                    break;

                case "Tiger":
                    Tiger tiger = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                    tiger.makeSound();

                    try {
                        tiger.eat(food);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    System.out.println(tiger);
                    break;

                case "Cat":
                    String catBreed = inputAnimal[4];
                    Cat cat = new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);

                    cat.eat(food);
                    cat.makeSound();

                    System.out.println(cat);

                    break;
            }

            input = scanner.nextLine();
        }
    }
}

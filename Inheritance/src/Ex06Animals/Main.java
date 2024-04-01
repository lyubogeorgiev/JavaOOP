package Ex06Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Animal> animals = new ArrayList<>();

        while (!input.equals("Beast!")) {
            String animalType = input;
            System.out.println(input);
            String[] animalTokens = scanner.nextLine().split("\\s+");

            try {
                switch (animalType) {
                    case "Dog":
                        Dog dog = new Dog(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
                        animals.add(dog);
                        break;
                    case "Frog":
                        Frog frog = new Frog(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
                        animals.add(frog);
                        break;
                    case "Cat":
                        Cat cat = new Cat(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
                        animals.add(cat);
                        break;
                    case "Kittens":
                        Kitten kitten = new Kitten(animalTokens[0], Integer.parseInt(animalTokens[1]));
                        animals.add(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(animalTokens[0], Integer.parseInt(animalTokens[1]));
                        animals.add(tomcat);
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(animals.size());
            input = scanner.nextLine();
        }

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal);
        }
    }
}

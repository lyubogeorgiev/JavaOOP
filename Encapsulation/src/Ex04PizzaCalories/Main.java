package Ex04PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] pizzaTokens = scanner.nextLine().split("\\s+");

        try {

            Pizza pizza = new Pizza(pizzaTokens[1], Integer.parseInt(pizzaTokens[2]));

            String input = scanner.nextLine();

            while (!input.equals("END")) {
                String[] tokens = input.split("\\s+");

                String command = tokens[0];

                if (command.equals("Dough")){
                    pizza.setDough(new Dough(tokens[1], tokens[2], Double.parseDouble(tokens[3])));
                } else if (command.equals("Topping")){
                    pizza.addTopping(new Topping(tokens[1], Double.parseDouble(tokens[2])));
                }

                input = scanner.nextLine();
            }

            System.out.println(pizza);


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

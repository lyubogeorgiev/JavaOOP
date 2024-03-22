package Ex03ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] peopleTokens = scanner.nextLine().split(";");
        String[] productsTokens = scanner.nextLine().split(";");

        Map<String, Person> people = new HashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        for (String personToken : peopleTokens) {
            String[] token = personToken.split("=");

            String name = token[0];
            double money = Double.parseDouble(token[1]);

            try {
                Person person = new Person(name, money);
                people.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        for (String productToken : productsTokens) {
            String[] token = productToken.split("=");

            String name = token[0];
            double cost = Double.parseDouble(token[1]);

            try {
                Product product = new Product(name, cost);
                products.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");

            String personName = tokens[0];
            String productName = tokens[1];

            Product currentProduct = products.get(productName);
            Person currentPerson = people.get(personName);

            currentPerson.buyProduct(currentProduct);

            input = scanner.nextLine();
        }

        for (Person person : people.values()) {
            System.out.println(person);
        }
    }
}

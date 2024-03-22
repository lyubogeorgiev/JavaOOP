package Ex03ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public void setName(String name) {
        this.validateName(name);

        this.name = name;
    }

    public void setMoney(double money) {
        this.validateMoney(money);

        this.money = money;
    }

    public void buyProduct(Product product) {
        if (this.money >= product.getCost()) {
            this.products.add(product);
            this.setMoney(this.money - product.getCost());
            System.out.printf("%s bought %s", this.getName(), product.getName());
        } else {
            System.out.printf("%s can't afford %s%n", this.getName(), product.getName());
        }
    }

    public String getName() {
        return this.name;
    }

    private void validateName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void validateMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    @Override
    public String toString() {
        String products = this.products.stream().map(Product::getName).collect(Collectors.joining(", "));

        if (products.trim().isEmpty()) {
            products = "Nothing bought";
        }
        return String.format("%s - %s", this.getName(), products);
    }
}

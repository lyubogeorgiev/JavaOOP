package L02SalaryIncrease;

import java.text.DecimalFormat;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    private void setSalary(double salary){
        this.salary = salary;
    }

    private double getSalary(){
        return this.salary;
    }

    private String getFirstName(){
        return this.firstName;
    }

    private String getLastName(){
        return this.lastName;
    }

    public void increaseSalary(double percentage){
        double percentIncrease = percentage;
        if (this.age < 30){
            percentIncrease /= 2;
        }

        this.setSalary(this.getSalary() * ((100 + percentIncrease) / 100));
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.0#######");
        return String.format("%s %s gets %s leva",
                this.getFirstName(),
                this.getLastName(),
                decimalFormat.format(this.getSalary()));
    }
}

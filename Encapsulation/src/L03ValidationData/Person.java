package L03ValidationData;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }

        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }

        this.age = age;
    }

    public void setSalary(double salary){
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    public void increaseSalary(double percent){
        double percentToIncrease = percent;
        if (this.age < 30){
            percentToIncrease /= 2;
        }

        this.setSalary(this.salary * ((100 + percentToIncrease) / 100));
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public double getSalary(){
        return this.salary;
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

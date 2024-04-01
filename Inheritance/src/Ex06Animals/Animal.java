package Ex06Animals;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.setAge(age);
        this.setGender(gender);
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid Input!");
        }

        this.age = age;
    }

    private void setGender(String gender) {
        if (!gender.equals("Male") && !gender.equals("Female")) {
            throw new IllegalArgumentException("Invalid Input!");
        }

        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", this.name, this.age, this.gender);
    }

    public abstract void produceSound();
}

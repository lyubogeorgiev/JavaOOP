package Ex06Animals;

public class Kitten extends Cat{
    public Kitten(String name, int age, String gender) {
        super(name, age, "Female");
    }

    public Kitten(String name, int age) {
        this(name, age, "female");
    }

    @Override
    public void produceSound() {
        System.out.println("Meow");
    }
}

package Ex06Animals;

public class Cat extends Animal{
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound() {
        System.out.println("Meow meow");
    }
}

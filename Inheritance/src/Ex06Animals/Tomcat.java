package Ex06Animals;

public class Tomcat extends Cat{
    public Tomcat(String name, int age, String gender) {
        super(name, age, "Male");
    }

    public Tomcat(String name, int age) {
        this(name, age, "Male");
    }

    @Override
    public void produceSound() {
        System.out.println("MEOW");
    }
}

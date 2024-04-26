package L05CodingTracker;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Tracker {
    @Author(name = "George")
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor();
    }

    @Author(name = "Peter")
    public static void printMethodsByAuthor() {
        Annotation authors =Author.class.getAnnotation(Author.class);

        Method[] methods = Tracker.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.printf("%s: %s()%n", author.name(), method.getName());
            }
        }
    }
}

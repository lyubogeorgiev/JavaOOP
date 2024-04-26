package L03HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> reflection = Reflection.class;

        Field[] fields = reflection.getDeclaredFields();
        Method[] methods = reflection.getDeclaredMethods();

        Set<String> wrongFields = new TreeSet<>();
        Set<String> wrongSetters = new TreeSet<>();
        Set<String> wrongGetters = new TreeSet<>();
        
        for (Field field : fields) {
            String modifiers = Modifier.toString(field.getModifiers());
            boolean isPrivate = modifiers.contains("private");

            if (!isPrivate) {
                wrongFields.add(String.format("%s must be private!", field.getName()));
            }
        }

        for (Method method : methods) {
            String methodName = method.getName();

            String modifiers = Modifier.toString(method.getModifiers());

            if (methodName.contains("get")){
                if (!modifiers.contains("public")) {
                    wrongSetters.add(String.format("%s have to be public!", methodName));
                }
            }

            if (methodName.contains("get")) {
                if (!modifiers.contains("private")) {
                    wrongGetters.add(String.format("%s have to be private!", methodName));
                }
            }
        }

        for (String wrongField : wrongFields) {
            System.out.println(wrongField);
        }

        for (String wrongGetter : wrongGetters) {
            System.out.println(wrongGetter);
        }

        for (String wrongSetter : wrongSetters) {
            System.out.println(wrongSetter);
        }
    }
}

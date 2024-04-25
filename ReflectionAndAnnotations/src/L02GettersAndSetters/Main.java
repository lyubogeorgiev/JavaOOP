package L02GettersAndSetters;

import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> reflection = Reflection.class;

        Method[] declaredMethods = reflection.getDeclaredMethods();

        Map<String, Method> setMethods = new TreeMap<>();
        Map<String, Method> getMethods = new TreeMap<>();

        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().startsWith("get")){
                getMethods.putIfAbsent(declaredMethod.getName(), declaredMethod);
            }

            if (declaredMethod.getName().startsWith("set")) {
                setMethods.putIfAbsent(declaredMethod.getName(), declaredMethod);
            }
        }

        for (Map.Entry<String, Method> getMethod : getMethods.entrySet()) {
            System.out.printf("%s will return %s%n", getMethod.getKey(), getMethod.getValue().getReturnType());
        }

        for (Map.Entry<String, Method> setMethod : setMethods.entrySet()) {
            System.out.printf("%s and will set field of %s%n",
                    setMethod.getKey(),
                    setMethod.getValue().getParameters()[0].getType());
        }
    }
}

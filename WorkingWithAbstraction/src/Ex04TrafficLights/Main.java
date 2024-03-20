package Ex04TrafficLights;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lights = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

//        int firstValue = Signal.valueOf("RED").ordinal() + 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < lights.length; j++) {
                int currentPosition = i + Signal.valueOf(lights[j]).ordinal() + 1;
                int lightNumber = currentPosition % Signal.values().length;

//                lights[j] = String.valueOf(Signal.values()[lightNumber]);
                System.out.print(Signal.values()[lightNumber] + " ");
            }

            System.out.println();
//            int lightNumber = i % Signal.values().length;

//            System.out.println(Arrays.stream(lights).collect(Collectors.joining(" ")));
        }
    }
}

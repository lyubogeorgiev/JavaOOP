package L01NumberInRange;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] boundaries = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int start = boundaries[0];
        int end = boundaries[1];

        System.out.printf("Range: [%d...%d]%n", start, end);

        int number;

        while (true) {
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);

                if (number < boundaries[0] || number > boundaries[1]) {
                    throw new NumberFormatException();
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + input);
            }
        }

        System.out.println("Valid number: " + number);
    }
}

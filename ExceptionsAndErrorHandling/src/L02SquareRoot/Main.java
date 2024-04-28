package L02SquareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = Integer.parseInt(scanner.nextLine());

            if (a < 0) {
                throw new NumberFormatException();
            }

            System.out.printf("%.2f%n", Math.sqrt(a));
        } catch (NumberFormatException e) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }
}

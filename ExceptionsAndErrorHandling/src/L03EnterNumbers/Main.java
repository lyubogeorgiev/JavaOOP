package L03EnterNumbers;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static final Integer END_NUMBER = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        Integer currentNumber = 1;

        while (numbers.size() < 10) {
            try {
                Integer number = readNumber(currentNumber, END_NUMBER, scanner);
                numbers.add(number);
                currentNumber = number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.printf("%s%n", numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));
    }

    public static Integer readNumber(Integer currentNumber, Integer endNumber, Scanner scanner) {

        Integer number = Integer.parseInt(scanner.nextLine());

        if (number <= currentNumber || number > endNumber) {
            throw new IllegalArgumentException("Your number is not in range " + currentNumber + " - " + endNumber + "!");
        }

        return number;
    }
}

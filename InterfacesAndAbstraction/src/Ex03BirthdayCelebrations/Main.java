package Ex03BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> list = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            String type = tokens[0];

            switch (type) {
                case "Citizen":
                    list.add(new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]));
                    break;
                case "Pet":
                    list.add(new Pet(tokens[1], tokens[2]));
                    break;
            }
            input = scanner.nextLine();
        }

        String searchWord = scanner.nextLine();
        String result = list.stream()
                .filter(l -> l.getBirthDate().endsWith(searchWord))
                .map(l -> String.valueOf(l.getBirthDate()))
                .collect(Collectors.joining("\n"));

        if (result.isEmpty()) {
            System.out.println("<no output>");
        } else {
            System.out.println(result);
        }
    }
}

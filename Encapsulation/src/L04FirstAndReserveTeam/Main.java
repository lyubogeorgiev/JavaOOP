package L04FirstAndReserveTeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Team team = new Team("Black Hawks");

        for (int i = 0; i < n; i++) {
            String[] personTokens = scanner.nextLine().split("\\s+");

            String firstName = personTokens[0];
            String lastName = personTokens[1];
            int age = Integer.parseInt(personTokens[2]);
            double salary = Double.parseDouble(personTokens[3]);

            Person person = new Person(firstName, lastName, age, salary);

            team.addPlayer(person);
        }

        System.out.printf("First team have %d players%n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n", team.getReserveTeam().size());
    }
}

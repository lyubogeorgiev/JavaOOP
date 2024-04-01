package L05BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> list = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            if (tokens.length < 3) {
                Robot robot = new Robot(tokens[1], tokens[0]);
                list.add(robot);
            } else {
                Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                list.add(citizen);
            }

            input = scanner.nextLine();
        }

        String idToSearch = scanner.nextLine();

        list.stream().filter(i -> i.getId().endsWith(idToSearch)).forEach(e -> System.out.println(e.getId()));
    }
}

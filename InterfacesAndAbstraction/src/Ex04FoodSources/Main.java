package Ex04FoodSources;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyers = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            if (tokens.length == 4) {
                //citizen
                buyers.put(tokens[0], new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]));
            } else if (tokens.length == 3) {
                //rebel
                buyers.put(tokens[0], new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            if (buyers.containsKey(input)) {
                buyers.get(input).buyFood();
            }

            input = scanner.nextLine();
        }

        int totalFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();

        System.out.println(totalFood);
    }
}

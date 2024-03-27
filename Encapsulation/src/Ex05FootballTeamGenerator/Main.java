package Ex05FootballTeamGenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Team> teams = new HashMap<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(";");

            String command = tokens[0];

            if (command.equals("Team")) {
                Team team;

                try {
                    team = new Team(tokens[1].trim());
                    teams.put(tokens[1].trim(), team);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            } else if (command.equals("Add")) {
                String teamName = tokens[1];
                String playerName = tokens[2];
                int endurance = Integer.parseInt(tokens[3]);
                int sprint = Integer.parseInt(tokens[4]);
                int dribble = Integer.parseInt(tokens[5]);
                int passing = Integer.parseInt(tokens[6]);
                int shooting = Integer.parseInt(tokens[7].trim());

                try {
                    if (!teams.containsKey(teamName)) {
                        throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                    }

                    teams.get(teamName).addPlayer(new Player(playerName, endurance, sprint, dribble, passing, shooting));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

            } else if (command.equals("Remove")) {
                String teamName = tokens[1];
                String playerName = tokens[2].trim();

                try {
                    if (!teams.containsKey(teamName)) {
                        throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
                    }

                    teams.get(teamName).removePlayer(playerName);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (command.equals("Rating")) {
                String teamName = tokens[1].trim();

                System.out.println(teams.get(teamName));
            }

            input = scanner.nextLine();
        }
    }
}

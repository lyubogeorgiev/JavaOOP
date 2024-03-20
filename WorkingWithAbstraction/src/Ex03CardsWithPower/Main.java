package Ex03CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        RankPower rankPower = RankPower.valueOf(cardRank);
        SuitPower suitPower = SuitPower.valueOf(cardSuit);

        int cardPower = rankPower.getPower() + suitPower.getPower();

        System.out.printf("Card name: %s of %s; Card power: %d", rankPower.getName(), suitPower.name(), cardPower);
    }
}

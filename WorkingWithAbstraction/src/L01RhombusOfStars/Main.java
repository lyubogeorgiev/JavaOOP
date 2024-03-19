package L01RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printRow(i, n);
        }

        for (int i = n - 1; i > 0 ; i--) {
            printRow(i, n);
        }

    }

    public static void printRow(int rowNumber, int totalRows){
        int intervals = totalRows - rowNumber;

        String result = " ".repeat(intervals) + "* ".repeat(rowNumber);

        System.out.println(result);
    }
}

package Ex01Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carTokens = scanner.nextLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(carTokens[1]);
        double carLitersPerKm = Double.parseDouble(carTokens[2]);

        String[] truckTokens = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(truckTokens[1]);
        double truckLitersPerKm = Double.parseDouble(truckTokens[2]);

        Car car = new Car(carFuelQuantity, carLitersPerKm);
        Truck truck = new Truck(truckFuelQuantity, truckLitersPerKm);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String command = tokens[0];
            String vehicleType = tokens[1];
            double distanceToTravel = Double.parseDouble(tokens[2]);

            switch (command) {
                case "Drive":
                    switch (vehicleType) {
                        case "Car":
                            car.drive(distanceToTravel);
                            break;
                        case "Truck":
                            truck.drive(distanceToTravel);
                            break;
                    }
                    break;
                case "Refuel":
                    switch  (vehicleType) {
                        case "Car":
                            car.refuel(distanceToTravel);
                            break;
                        case "Truck":
                            truck.refuel(distanceToTravel);
                            break;
                    }
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
    }
}

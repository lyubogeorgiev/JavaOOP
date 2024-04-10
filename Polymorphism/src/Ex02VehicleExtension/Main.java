package Ex02VehicleExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carTokens = scanner.nextLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(carTokens[1]);
        double carLitersPerKm = Double.parseDouble(carTokens[2]);
        double carTankCapacity = Double.parseDouble(carTokens[3]);

        String[] truckTokens = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(truckTokens[1]);
        double truckLitersPerKm = Double.parseDouble(truckTokens[2]);
        double truckTankCapacity = Double.parseDouble(truckTokens[3]);

        String[] busTokens = scanner.nextLine().split("\\s+");
        double busFuelQuantity = Double.parseDouble(busTokens[1]);
        double busLitersPerKm = Double.parseDouble(busTokens[2]);
        double busTankCapacity = Double.parseDouble(busTokens[3]);

        Car car = new Car(carFuelQuantity, carLitersPerKm, carTankCapacity);
        Truck truck = new Truck(truckFuelQuantity, truckLitersPerKm, truckTankCapacity);
        Bus bus = new Bus(busFuelQuantity, busLitersPerKm, busTankCapacity);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String command = tokens[0];
            String vehicleType = tokens[1];
            double distanceToTravel = Double.parseDouble(tokens[2]);

            switch (command) {
                case "DriveEmpty":
                    bus.setEmpty(true);
                    bus.drive(distanceToTravel);
                    break;
                case "Drive":
                    switch (vehicleType) {
                        case "Car":
                            car.drive(distanceToTravel);
                            break;
                        case "Truck":
                            truck.drive(distanceToTravel);
                            break;
                        case "Bus":
                            bus.setEmpty(false);
                            bus.drive(distanceToTravel);
                            break;
                    }
                    break;
                case "Refuel":
                    try {

                        switch  (vehicleType) {
                            case "Car":
                                car.refuel(distanceToTravel);
                                break;
                            case "Truck":
                                truck.refuel(distanceToTravel);
                                break;
                            case "Bus":
                                bus.refuel(distanceToTravel);
                                break;
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}

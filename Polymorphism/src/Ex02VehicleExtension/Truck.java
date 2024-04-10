package Ex02VehicleExtension;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    private final static double AC_INCREASED_CONSUMPTION = 1.6;
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.setFuelConsumption(this.getFuelConsumption() + AC_INCREASED_CONSUMPTION);
    }

    @Override
    void drive(double distance) {
        double fuelNeeded = this.getFuelConsumption() * distance;
        if  (fuelNeeded > this.getFuelQuantity()) {
            System.out.println("Truck needs refueling");
        } else {
            this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.printf("Truck travelled %s km%n", decimalFormat.format(distance));
        }
    }

    @Override
    void refuel(double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        if (this.getFuelQuantity() + liters > this.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.setFuelQuantity(this.getFuelQuantity() + 0.95 * liters);
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", this.getFuelQuantity());
    }
}

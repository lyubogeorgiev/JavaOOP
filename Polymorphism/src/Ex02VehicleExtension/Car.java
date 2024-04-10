package Ex02VehicleExtension;

import java.text.DecimalFormat;

public class Car extends Vehicle {
    private static final double AC_INCREASED_CONSUMPTION = 0.9;
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.setFuelConsumption(this.getFuelConsumption() + AC_INCREASED_CONSUMPTION);
    }

    @Override
    void drive(double distance) {
        double fuelNeeded = this.getFuelConsumption() * distance;

        if (fuelNeeded < this.getFuelQuantity()) {
            this.setFuelQuantity(this.getFuelQuantity() - fuelNeeded);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            System.out.printf("Car travelled %s km%n", decimalFormat.format(distance));
        } else {
            System.out.println("Car needs refueling");
        }
    }

    @Override
    void refuel(double liters) {
        this.checkIfFuelFits(liters);
        this.setFuelQuantity(this.getFuelQuantity() + liters);
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", this.getFuelQuantity());
    }
}

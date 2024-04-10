package Ex02VehicleExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle{

    private static final double AC_INCREASED_CONSUMPTION = 1.4;

    private boolean isEmpty;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.setEmpty(true);
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    void drive(double distance) {
        double currentFuelConsumption = this.getFuelConsumption();

        if (!this.isEmpty) {
            currentFuelConsumption += AC_INCREASED_CONSUMPTION;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        if (this.getFuelQuantity() >= currentFuelConsumption * distance) {
            this.setFuelQuantity(this.getFuelQuantity() - currentFuelConsumption * distance);
            System.out.printf("Bus travelled %s km%n", decimalFormat.format(distance));
        } else {
            System.out.println("Bus needs refueling");
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

        this.setFuelQuantity(this.getFuelQuantity() + liters);
    }

    @Override
    public String toString() {
        return String.format("Bus: %.2f", this.getFuelQuantity());
    }
}

package practice.Car;

public class Car {
    double fuelTankCapacity;
    double fuelConsumption;

    public double CalculateRange () {
        return (fuelTankCapacity / fuelConsumption)* 100;
    }

    public Car (double fuelTankCapacity, double fuelConsumption) {
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelConsumption = fuelConsumption;
    }
}

package homeWork2.TemperatureConverter;

public class TemperatureConverter {
    double temperature;

    public TemperatureConverter(double temperature) {
        this.temperature = temperature;
    }


    public double toCelsius() {
        return (temperature - 32) * 5 / 9;
    }

    public double toFahrenheit() {
        return (temperature * 9 / 5) + 32;
    }

}

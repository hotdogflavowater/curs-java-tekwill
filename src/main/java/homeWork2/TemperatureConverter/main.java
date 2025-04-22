package homeWork2.TemperatureConverter;

public class main {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter(20);
            double celsius = tc.toCelsius();
            System.out.println(celsius);
            double fahrenheit = tc.toFahrenheit();
            System.out.println(fahrenheit);
    }
}

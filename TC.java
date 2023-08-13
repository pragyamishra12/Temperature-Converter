import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("====================");

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Select the input scale:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int inputChoice = scanner.nextInt();

        System.out.println("Select the output scale:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int outputChoice = scanner.nextInt();

        double convertedTemperature = convertTemperature(temperature, inputChoice, outputChoice);
        System.out.println("Converted temperature: " + convertedTemperature);
    }

    public static double convertTemperature(double temperature, int inputChoice, int outputChoice) {
        double convertedTemperature = 0.0;

        switch (inputChoice) {
            case 1: // Celsius
                switch (outputChoice) {
                    case 1: // Celsius
                        convertedTemperature = temperature;
                        break;
                    case 2: // Fahrenheit
                        convertedTemperature = (temperature * 9 / 5) + 32;
                        break;
                    case 3: // Kelvin
                        convertedTemperature = temperature + 273.15;
                        break;
                }
                break;
            case 2: // Fahrenheit
                switch (outputChoice) {
                    case 1: // Celsius
                        convertedTemperature = (temperature - 32) * 5 / 9;
                        break;
                    case 2: // Fahrenheit
                        convertedTemperature = temperature;
                        break;
                    case 3: // Kelvin
                        convertedTemperature = (temperature + 459.67) * 5 / 9;
                        break;
                }
                break;
            case 3: // Kelvin
                switch (outputChoice) {
                    case 1: // Celsius
                        convertedTemperature = temperature - 273.15;
                        break;
                    case 2: // Fahrenheit
                        convertedTemperature = (temperature * 9 / 5) - 459.67;
                        break;
                    case 3: // Kelvin
                        convertedTemperature = temperature;
                        break;
                }
                break;
        }

        return convertedTemperature;
    }
}
package Temperature;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the temperature value: ");
		double temperature = scanner.nextDouble();

		System.out.print("Enter the original unit(C for Celsius, F for Fahrenheit, K for Kelvin): ");
		char unit = scanner.next().toUpperCase().charAt(0);

		switch (unit) {
		case 'C':
			convertFromCelsius(temperature);
			break;
		case 'F':
			convertFromFahrenheit(temperature);
			break;
		case 'K':
			convertFromKelvin(temperature);
			break;
		default:
			System.out.println("Invalid unit, Please eneter C, F, or K.");
			break;
		}
		scanner.close();
	}

	public static void convertFromCelsius(double celsius) {
		double fahrenheit = (celsius * 9 / 5) + 32;
		double kelvin = celsius + 273.15;
		System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit and %.2f Kelvin%n", celsius, fahrenheit, kelvin);
	}

	public static void convertFromFahrenheit(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		double kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
		System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius and %.2f Kelvin%n", fahrenheit, celsius, kelvin);
	}

	public static void convertFromKelvin(double kelvin) {
		double celsius = kelvin - 273.15;
		double fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
		System.out.printf("%.2f Kelvin is equal to %.2f Celsius and %.2f Fahrenheit%n", kelvin, celsius, fahrenheit);
	}
}

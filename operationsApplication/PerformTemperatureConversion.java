package operationsApplication;

import operationsLibrary.TemperatureConverter;
import java.util.Scanner;

public class PerformTemperatureConversion{
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Select an option (1 or 2): ");

        String choice = scanner.nextLine();

        switch (choice){
            case "1":
                System.out.print("Enter temperature in Celsius.");
                double celsius = Double.parseDouble(scanner.nextLine());
                double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
                System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", celsius, fahrenheit);
                break;
            
                case "2":
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit2 = Double.parseDouble(scanner.nextLine());
                    double celsius2 = TemperatureConverter.fahrenheitToCelsius(fahrenheit2);
                    System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", fahrenheit2, celsius2);
                    break;

                default:
                System.out.println("Invalid option!");
                break;
        }
scanner.close();
    }
}
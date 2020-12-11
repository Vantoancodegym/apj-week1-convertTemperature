import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter celsius");
                    double celsius=input.nextDouble();
                    System.out.println(celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("enter fahrenheit");
                    double fahrenheit=input.nextDouble();
                    System.out.println(fahrenheitToCelsius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);

    }
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;

    }
    public static double fahrenheitToCelsius(double fahrenheit) {
         return (5.0 / 9) * (fahrenheit - 32);
    }
}

import javax.xml.transform.Source;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //exercise 1
        printMyName();
        printSum();
        divide();
        printOperations();

        //exercise 2
        System.out.println("Rezultatul adunarii este:" + add(5,8));
        System.out.println("Rezultatul scaderii este:" + substract(1, 7));
        System.out.println("Rezultatul multiplicarii este:" + multiplicate(6, 2));
        System.out.println("Rezultatul impartirii este:" + divide(14, 7));

        //exercise 3
        System.out.println("Media celor trei numere este:" + average(7, 2, 8));

        //exercise 4
        System.out.println("Restul impartirii a doua numere este:" + remainder (17, 7));

        //exercise 5
        double fahrenheit = 131.6;
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("Gradele in Celsius sunt:" + celsius);

        //exercise 6
        double inches = 5;
        double meters = inchesToMeters(inches);
        System.out.println("Inches in metri sunt:" + meters);

        //exercise 7
        displaySpeed(30000, 7, 8, 8);

        //exercise 9
        displayPattern();




    }

    public static void printMyName() {
        System.out.println("Hello");
        System.out.println("Marisa");
    }

    public static void printSum() {
        System.out.println(4 + 5);

    }

    public static void divide() {
        int a = 13;
        int b = 4;
        float result = (float) a / b;
        System.out.println(result);
    }

    public static void printOperations() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public static int add(int a, int b){
        int result = a+b;
        return result;

    }

    public static int substract(int a, int b) {
        int result = a-b;
        return result;
    }

    public static int multiplicate(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int divide(int a, int b) {
        int result = a / b;
        return result;
    }

    public static int average(int a, int b, int c) {
        int result = (a + b + c) / 3;
        return result;
    }

    public static int remainder(int dividend, int divisor) {
        return dividend % divisor;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (double) 5 / 9 * (fahrenheit - 32);
    }

    public static double inchesToMeters(double inches) {
        final double CONVERSION_FACTOR = 0.0254;
        return inches * CONVERSION_FACTOR;
    }

    public static void displaySpeed(float distanceMeters, int hours, int minutes, int seconds) {
        float totalTimeSec = hours * 3600 + minutes * 60 + seconds;
        float speedMPerSec = distanceMeters / totalTimeSec;
        float speedKmPerHour = (distanceMeters / 1000) / (totalTimeSec / 3600);
        float speedMilesPerHour = (float) (distanceMeters / 1609.34) / (totalTimeSec / 3600);
        System.out.println("Viteza in metri pe secunda:" + speedMPerSec);
        System.out.println("Viteza in km pe ora:" + speedKmPerHour);
        System.out.println("Viteza in mile pe ora:" + speedMilesPerHour);

    }

    public static void displayPattern() {
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
    }
}
import java.util.Scanner;

public class Task1LengthMil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length in miles: ");
        double value = input.nextDouble();

        double conversion = (value *1.609);

        System.out.println(value + " miles converts into " + conversion + " kilometres");

    }
}

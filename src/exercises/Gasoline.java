package exercises;

import java.util.Scanner;

public class Gasoline {
    public static void main(){

    }

    public static void milesPerHour(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Please enter the amount of gas used(in gallons): ");
        double gas = input.nextDouble();
        double mpg = miles / gas;

        System.out.println("The miles per gallon for your vehicle is: " + mpg);

    }

}

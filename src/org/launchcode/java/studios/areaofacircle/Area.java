package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

public class Area {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a circle radius: ");
        String userInput = input.nextLine();

        double radius = Double.parseDouble(userInput);
        double circleArea = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + userInput + " is: " + circleArea);

        input.close();
    }

//    public static double calculateCircleArea(double userRaduis){
//        return  Math.PI * userRaduis * userRaduis;
//    }
}

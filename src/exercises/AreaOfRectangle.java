package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){

    }
    public static void area(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a length for a rectangle: ");
        int length = input.nextInt();
        System.out.println("Please enter a width for a rectangle: ");
        int width = input.nextInt();
        int area = length * width;

        System.out.println("The area of your rectangle is: " + area);
    }
}

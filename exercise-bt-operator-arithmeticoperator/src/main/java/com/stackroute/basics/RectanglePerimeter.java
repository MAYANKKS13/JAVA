package com.stackroute.basics;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {

        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {

        Scanner obj = new Scanner(System.in);

         double length = obj.nextDouble();
         double  breadth = obj.nextDouble();

         double result = perimeterCalculator(length, breadth);

        System.out.println(result);

    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {


        return 2.0 * (length + breadth);
    }
}

package com.stackroute.basics;

import java.util.Scanner;
public class NumberAverage {

    public static void main(String[] args) {

        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
           Scanner sc = new Scanner(System.in);

           int size = sc.nextInt();
           int[] inputArray = new int[size];

           for (int i = 0; i < size; i++)
           {
               inputArray[i] = sc.nextInt();
           }

           String result = findAverage((inputArray));
        System.out.println(result);


    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {

        if(inputArray.length == 0)
        {
            return "Empty array";
        }


            int sum = 0;

            for (int i = 0; i < inputArray.length; i++)
            {
                if(inputArray[i]<0)
                {
                    return "Give proper positive integer values";
                }
                sum = sum + inputArray[i];

            }

             int average = sum / inputArray.length;

            return String.format("The average value is: " + average);





    }
}

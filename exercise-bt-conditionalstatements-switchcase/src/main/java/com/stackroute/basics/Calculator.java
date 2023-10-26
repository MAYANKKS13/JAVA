package com.stackroute.basics;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.lang.Exception;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);

        char choice;
        do {
            new Calculator().getValues(scan);

            System.out.println("Do you want to try again(y/n)");
            choice = scan.next().charAt(0);
            if (choice == 'n')
                break;
            if (choice == 'y') {
                Calculator.main(null);
            }
        }
        while(choice=='y');
    }

    //Get values and which operator from the menu
    public void getValues(@NotNull Scanner scan) {

        int firstValue = scan.nextInt();
        int secondValue = scan.nextInt();
        int operator = scan.nextInt();

        if(secondValue == 0)
        {
            System.out.println("The divider (secondValue) cannot be zero");
        }
        else {

            String result = new Calculator().calculate(firstValue, secondValue, operator);
            System.out.println(result);
        }

    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {

        int result = 0;
        String s = "";
        switch (operator) {
            case 1:
                result = firstValue + secondValue;
                s = String.format(firstValue + " + " + secondValue + " = " + result);
                return  s;

            case 2:
                result = firstValue - secondValue;
                s = String.format(firstValue + " - " + secondValue + " = " + result);
                return  s;

            case 3:
                result = firstValue * secondValue;
                s = String.format(firstValue + " * " + secondValue + " = " + result);
                return  s;

        case 4:
                    result = firstValue / secondValue;
                    s = String.format(firstValue + " / " + secondValue + " = " + result);
                    return s;

        }
             return String.format("Entered wrong option" + " " + operator);
    }
}

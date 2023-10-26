package com.stackroute.basics;


import java.math.BigInteger;
import java.util.Scanner;

public class Palindrome {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Palindrome().getValue();
    }

    // get values from the user using scanner
    public void getValue() {

       Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        scanner.close();
        if (inputValidator(input)) {
            BigInteger value = new BigInteger(input);
            String result = palindromeValidator(value);
            outputPrinter(result);
        } else{
            System.out.print("Wrong input, give proper positive integer\n");
        }

    }

    // validate the input using inputValidator and print the error message or the result from palindromeValidator
    public void outputPrinter(String number) {
        System.out.println(number);
    }
    // check whether the input is a valid integer and return boolean
    public boolean inputValidator(String number) {

        return number.matches("^[0-9]+$") && number.length() > 1;
    }


    // write logic to check for palindrome using BigInteger & Do-while
    public String palindromeValidator(BigInteger number) {

        if (number.compareTo(BigInteger.TEN) < 0) {
            return "The integer have to be at least a two digit positive integer";
        }

        BigInteger reversedNum = BigInteger.ZERO;
        BigInteger tempNum = number;

        while (tempNum.compareTo(BigInteger.ZERO) > 0) {
            BigInteger remainder = tempNum.remainder(BigInteger.TEN);
            reversedNum = reversedNum.multiply(BigInteger.TEN).add(remainder);
            tempNum = tempNum.divide(BigInteger.TEN);
        }

        BigInteger originalNum = number;
        if (originalNum.equals(reversedNum)) {
            return originalNum + " is a palindrome";
        } else {
            return originalNum + " is not a palindrome";
        }


    }
}

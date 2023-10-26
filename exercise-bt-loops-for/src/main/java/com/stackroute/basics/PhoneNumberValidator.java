package com.stackroute.basics;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberValidator object = new PhoneNumberValidator();
        String input = object.getInput();
        boolean result = object.validatePhoneNumber(input);
        object.displayResult(result);
    }

    public String getInput() {
         return scanner.nextLine();
    }

    public void displayResult(boolean result) {
        if (result) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid or empty string");
        }
    }

    public boolean validatePhoneNumber(String s1) {
        int sum = 0;
        boolean flag = true;
        if(s1==null)
        {
            return false;
        }
        StringTokenizer st = new StringTokenizer(s1, "-");
        while (st.hasMoreTokens()) {
            String s2 = st.nextToken();
            sum = sum + s2.length();
            for (int i = 0; i < s2.length(); i++) {
                if (!Character.isDigit(s2.charAt(i))) {
                    flag = false;
                    break;
                }
            }
        }
        if (sum == 10 && flag) {
            return true;
        }
        else {
            return false;
        }
    }
}

package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Get three strings from the user
        StringFinder stringFinder = new StringFinder();
        stringFinder.getInput();
        stringFinder.closeScanner();
    }

    public String getInput() {

        String searchString = sc.nextLine();
        String firstString = sc.nextLine();
        String secondString = sc.nextLine();

        int result = findString(searchString,firstString,secondString);
        displayResult(result);

        return null;
    }

    public void displayResult(int result) {
        //displays the result

        if(result==1)
        {
            System.out.println("Found as expected");
        } else if (result==0) {
            System.out.println("Not found");

        } else if (result==-1) {
            System.out.println("Empty string or null");

        }


    }

    public int findString(String searchString, String firstString, String secondString) {

        if(searchString==null || searchString.isEmpty() || firstString==null || firstString.isEmpty() || secondString==null || secondString.isEmpty())
        {
            return -1;
        }

        if(searchString.indexOf(firstString)!=-1 && searchString.indexOf(secondString)!=-1)
        {
            if(searchString.indexOf(firstString) < searchString.indexOf(secondString))
            {
                return 1;
            }
        }

        return 0;
    }

    public void closeScanner() {
        if(sc!=null)
        {
            sc.close();
        }
    }
}

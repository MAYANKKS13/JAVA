package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //call the functions in the required sequence

        PhoneNumberValidator phone = new PhoneNumberValidator();
        String string = phone.getInput();
        int result = phone.validatePhoneNumber(string);
        phone.displayResult(result);
    }

    public String getInput() {

        String str = sc.nextLine();
        return str;

    }

    public void displayResult(int result) {

          if(result ==1)
          {
              System.out.println("valid");
          }

          else if (result == 0)
          {
              System.out.println("invalid");
          }

          else {
              System.out.println("emptystring");
          }


        //displays the result
    }

    public int validatePhoneNumber(String input) {

           String s = "";
           if(input == null || input.isEmpty())
           {
               return -1;
           }

           int length = input.length();

           for(int i = 0; i < length; i++)
           {
               if(input.charAt(i)>='0' && input.charAt(i)<='9')
               {
                   s = s + input.charAt(i);
               }

               else if (input.charAt(i) == '-')
               {
                   continue;
               }

               else {
                   return 0;
               }
           }

           if(s.length() == 10)
           {
               return 1;
           }

           return 0;
    }




    public void closeScanner(){
        //close the Scanner object
        if(sc!=null)
        {
            sc.close();
        }
    }
}

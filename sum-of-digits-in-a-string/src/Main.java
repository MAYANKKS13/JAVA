import java.util.*;

public class Main {

    public static int sumOfDigits(String s)
    {

        int sum = 0;

        for(int i = 0; i<s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int num = Character.getNumericValue(s.charAt(i));

                sum = sum + num;
            }
        }
        return sum;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        int reqSum = sumOfDigits(string);
        System.out.println("Required sum is :" + reqSum);


    }


}
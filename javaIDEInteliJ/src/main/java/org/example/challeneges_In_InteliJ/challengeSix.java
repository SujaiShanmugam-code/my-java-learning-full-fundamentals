package org.example.challeneges_In_InteliJ;


// Exception handling!

import java.util.Scanner;

class DivisionExample
{
    void divideNumber(int numerator , int deneminator)
    {
        try
        {
            int divideResult = numerator / deneminator;

            System.out.println("The divison result: "+divideResult);

        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divided by Zero "+e);
        }
        finally {
            System.out.println("Finished!");
        }

    }
}


public class challengeSix
{
    public static void main(String[] args)
    {
        System.out.println("This is challenge Six!");
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number for numerator");
        int numerator = input.nextInt();

        System.out.println("Enter the number for numerator");
        int deneminator = input.nextInt();


        DivisionExample d1 = new DivisionExample();

        d1.divideNumber(numerator,deneminator);

    }
}

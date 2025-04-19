package org.example.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exerciseSix
{
    public static void main(String[] args)
    {
        System.out.println("This if for Exception handling!!");
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers for division!");

        int number1 = 0;
        int number2 = 0;
        int divisionResult =0;
        int err =0;
        int age=0;

        try {
            number1 = input.nextInt();
            number2 = input.nextInt();
            divisionResult = number1 / number2;
            err++;

            age = input.nextInt();
            if(age<1)
            {
                throw new InputMismatchException("Age should be more than 1"); // if i wanted to throw some error.
            }

        } catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Problem! " + e);
            err++;
        } catch (InputMismatchException e) {
            System.out.println("Input Problem! " + e);
            err++;
        }
        finally {
            System.out.println("The number of error: "+ err);
        } // nichayama nadakanum.

        if(divisionResult!=0)
        {
            System.out.println("The final division result is: "+divisionResult);
        }

        System.out.println("Program ended.");

    }
}

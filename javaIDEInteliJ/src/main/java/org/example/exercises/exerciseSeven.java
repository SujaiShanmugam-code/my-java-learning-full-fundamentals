package org.example.exercises;


import java.util.Scanner;

class ageViolationException extends Exception
{
    public ageViolationException(String comment)
    {
        super(comment);

    }


}

public class exerciseSeven
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");


        try
        {
            int age = input.nextInt();
           if(age < 18)
           {
               throw new ageViolationException("Your age shouold be more than 18!");
           }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finished!");
        }





    }
}

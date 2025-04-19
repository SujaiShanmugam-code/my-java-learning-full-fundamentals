package org.example.challeneges_In_InteliJ;


class InvalidAgeException extends Exception
{

    public InvalidAgeException(String comment)
    {
        super(comment);
    }
}

class AgeValidator
{
    public void checkAge(int age)
    {
        try {
            if (age < 0 || age > 150) {
                throw new InvalidAgeException("Age is Not Valid.");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

public class challengeSeven
{
    public static void main(String[] args)
    {
        AgeValidator a1 = new AgeValidator();

        a1.checkAge(1900);

    }
}

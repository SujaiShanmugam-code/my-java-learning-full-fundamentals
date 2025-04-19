package org.example.exercises;

// abstract.
abstract class House{

    abstract void welcome();

}

class Hall extends House
{
    @Override
    void welcome()
    {
        System.out.println("Hello and Welcome.");
    }
}

public class exerciseFour
{
    public static void main(String[] args)
    {
        System.out.println("This is exercise four.");

        Hall h1 = new Hall();
        h1.welcome();
    }
}

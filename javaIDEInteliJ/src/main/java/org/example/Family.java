package org.example;

// Inheritence - "extents"

class Dad{

    int money = 2000;

}

class Son extends Dad
{

    public Son()
    {
        System.out.println("Son Constructor Called.");
    }

}

public class Family
{
    public static void main(String[] args)
    {
        System.out.println("This is the Family.");

        Son obj = new Son();

        System.out.println(obj.money);



    }
}

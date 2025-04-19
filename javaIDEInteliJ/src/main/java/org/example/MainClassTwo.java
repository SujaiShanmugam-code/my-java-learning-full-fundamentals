package org.example;


interface Printabe
{
    void display();

}

interface Showable
{
    void display();

}


class Document implements Printabe,Showable
{
    @Override
    public void display()
    {
        System.out.println("Hii , Diamond Problem Avoided.");
    }
}

public class MainClassTwo
{
    public static void main(String[] args)
    {
        System.out.println("This is for Interface!");

        Document d1 = new Document();
        d1.display();

    }
}

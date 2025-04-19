package org.example;

// accessing values using object.
public class Student
{
    int age = 19;
    String name ="Sujai Shanmugam.";

    //Constructor.
    public Student()
    {
        System.out.println("Constructor Called!");
    }

    public static void main(String[] args)
    {
        System.out.println("This is Student!");

        Student obj = new Student();

        System.out.println(obj.age);
        System.out.println(obj.name);


    }
}

package org.example;


// Constructor with parameter.
public class Teacher
{
    int age;
    String name;

    public Teacher(int a, String b)
    {
        age = a;
        name = b;
        System.out.println("Teacher Constructor Called.");
    }



    public static void main(String[] args)
    {
        System.out.println("Hii..");

        Teacher obj = new Teacher(29, "Sahana");

        System.out.println(obj.age);
        System.out.println(obj.name);



    }
}

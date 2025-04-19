package org.example.exercises;
// super keyword.

class Person{

    String name;

    public Person(String name)
    {
       this.name = name;

        System.out.println("Person Constructor Called.");
    }

}

class Employee extends Person
{
    int employeeId;

    public Employee(String name)
    {
        super(name);

        System.out.println("Employee Constructor Called.");
    }

    String getEmployeeDetails()
    {
        return this.name;
    }

}

public class exerciseThree
{
    public static void main(String[] args)
    {
        System.out.println("This is exericse Three.");

        System.out.println(); // for extra spacing.

        Employee e1 =  new Employee("Sujai");

        String details = e1.getEmployeeDetails();

        System.out.println(details);


    }
}

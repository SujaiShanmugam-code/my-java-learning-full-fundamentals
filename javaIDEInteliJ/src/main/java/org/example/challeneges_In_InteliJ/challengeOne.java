package org.example.challeneges_In_InteliJ;

//Access Modifier.
class Person
{
    public String name;
    protected int age;
    private String socialSecuriyNumber;
    String address;

    void getSecurityNumber()
    {
        System.out.println(socialSecuriyNumber);
    }

    public Person(String name , int age , String socialSecuriyNumber , String address)
    {
        this.name = name;
        this.age = age;
        this.socialSecuriyNumber = socialSecuriyNumber;
        this.address = address;

        System.out.println("Person Constructor Called.");
    }


}

class Employee extends Person
{
    public Employee(String name,int age,String socialSecurityNumber,String address)
    {
        super(name,age,socialSecurityNumber,address);
        System.out.println("Employee Constructor Called.");
    }

}
public class challengeOne
{
    public static void main(String[] args) {
        System.out.println("This is Exercise One.");

        System.out.println(); // for extra spacing

        Employee e1 = new Employee("Sujai", 19, "xoaienp1239", "India");


        System.out.println(e1.name);
        System.out.println(e1.address);
        System.out.println(e1.age);

        e1.getSecurityNumber();
    }
}

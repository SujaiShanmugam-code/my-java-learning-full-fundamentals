package org.example.exercises;


class Vehicle
{
    String brand;
    int year;

    void startEngine()
    {

    }

}

class Car extends Vehicle
{
    String fuelType;

    @Override
    void startEngine()
    {
        System.out.println("Car engine Starts.");
    }

    void drive()
    {
        System.out.println("Car is driving.");
    }
}

class Truck extends Vehicle
{
    @Override
    void startEngine() {
        System.out.println("Truck engine starts.");
    }

    void haul()
    {
        System.out.println("Truck is hauling.");
    }
}

public class exerciseTwo
{
    public static void main(String[] args)
    {
        System.out.println("This is the Exercise - 2");

        Car c1 = new Car();

        c1.brand = "BMW";
        c1.year = 2024;
        c1.fuelType = "petrol";

        c1.startEngine();
        c1.drive();

        Truck t1 = new Truck();

        t1.brand = "BMW";
        t1.year = 2024;

        t1.startEngine();
        t1.haul();

    }
}

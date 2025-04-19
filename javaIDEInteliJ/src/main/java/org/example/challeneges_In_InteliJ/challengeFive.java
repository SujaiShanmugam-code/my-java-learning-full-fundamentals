package org.example.challeneges_In_InteliJ;
//It has all the previous concepts

abstract class Vehicle
{
    // it won't re-write.
    final void startEngine()
    {
        System.out.println("Engine Started!");
    }

    static String getVehicleType()
    {
        return "Generic Vehicle.";
    }

  abstract void drive();

}

class Car extends Vehicle
{
    void drive()
    {
        System.out.println("Car is Driven!");
    }

}

class MotorCycle extends Vehicle
{
    void drive()
    {
        System.out.println("MotorCycle is Driven!");
    }

}




public class challengeFive
{
    public static void main(String[] args)
    {

        System.out.println("This is Challenge five!");
        System.out.println();

        Car c1 = new Car();
        c1.drive();

        System.out.println(Vehicle.getVehicleType()); // if this is static method then i can call this using the class name.


    }
}

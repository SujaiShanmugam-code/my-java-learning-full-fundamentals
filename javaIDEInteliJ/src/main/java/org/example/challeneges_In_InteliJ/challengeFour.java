package org.example.challeneges_In_InteliJ;

//Abstract Class

abstract  class Animal
{
    String name;

    public Animal(String name)
    {
        this.name = name;

    }
    abstract void makeSound();
}

class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Dog Barks!");
    }
}

class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);

    }
    @Override
    void makeSound()
    {
        System.out.println("Cat meows!");
    }
}


public class challengeFour
{
    public static void main(String[] args) {

        System.out.println("This is challenge Four!");
        System.out.println();

        Dog d1 = new Dog("Tommy");
        System.out.println(d1.name);
        d1.makeSound();


        Cat c1 = new Cat("Julie");
        System.out.println(c1.name);
        c1.makeSound();


    }
}

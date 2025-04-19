package org.example;

//Types of Inheritence.

class Animal{ //Super class , rest sub or derived classes.

    String name;

    void eat()
    {
        System.out.println("Can Eat.");
    }

}

class Dog extends Animal{

    void bark()
    {
        System.out.println("Can bark.");
    }

}

class Puppy extends Dog
{
    void weep()
    {
        System.out.println("Can weep.");
    }


}

class Cat extends Animal
{
    void meow()
    {
        System.out.println("Can meow");
    }


}



public class Forest
{
    public static void main(String[] args)
    {
        System.out.println("This is Forest.");

        Cat obj = new Cat();
        String name = obj.name = "Cat";

        System.out.println(name);



//        Animal obj = new Animal();
//
//        obj.eat();
//
//        Dog obj1 = new Dog();
//
//        obj1.eat();
//
//        Puppy obj2 = new Puppy();
//
//        obj2.eat();

    }
}

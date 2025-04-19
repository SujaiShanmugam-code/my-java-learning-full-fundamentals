package org.example.exercises;


 class Animal
 {
     String name;
     int age;

     void makeSound()
     {
         System.out.println("Animal makes sound.");
     }

 }

 class Dog extends Animal
 {
     String breed;

     @Override
     void makeSound()
     {
         System.out.println("Dog Barks.");
     }
     void fetch()
     {
         System.out.println("Dog is fetching.");
     }

 }

 class Cat extends Animal
 {
     String color;

     @Override
     void makeSound()
     {
         System.out.println("Cat meows.");
     }

     void climb()
     {
         System.out.println("Cat is climbing.");
     }
 }
public class exerciseOne
{
    public static void main(String[] args)
    {

        Dog d1 = new Dog();
        d1.name ="Naaiyii";
        d1.age = 8;
        d1.breed = "Naatunaai";
        d1.makeSound();
        d1.fetch();

        Cat c1 = new Cat();
        c1.name = "Poona";
        c1.age  =5;
        c1.color = "little pink";
        c1.makeSound();
        c1.climb();

//        Animal a1 = new Animal();
//
//        a1.name = "Subramani";
//        a1.age = 7;
//        a1.makeSound();


    }
}

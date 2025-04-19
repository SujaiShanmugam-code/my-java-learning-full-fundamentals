package org.example;

class A extends Thread
{
    public void run()
    {
        for(int i=0;i < 50 ; i++)
        {
            System.out.println("Sujai");

            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread
{
    public  void run()
    {
        for(int i=0;i < 50 ; i++)
        {
            System.out.println("Sahana");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}


public class MainClassSix
{
    public static void main(String[] args)
    {
        System.out.println("For threads!");

        System.out.println();

        A a1 = new A();
        B b1 = new B();

        a1.start();
        b1.start();

        a1.setPriority(10);



    }
}

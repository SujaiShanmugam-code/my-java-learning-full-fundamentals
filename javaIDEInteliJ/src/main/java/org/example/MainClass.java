package org.example;

interface Playable
{
    void play();
}

class Guitar implements Playable
{
    @Override
    public void play()
    {
        System.out.println("playing Guitar");
    }

}

class Piano implements Playable
{
    @Override
    public void play()
    {
        System.out.println("playing piano");

    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("this is for interface");

        Piano p1 = new Piano();
        p1.play();

    }
}

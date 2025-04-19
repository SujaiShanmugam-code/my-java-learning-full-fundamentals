package org.example.challeneges_In_InteliJ;

// static keyword.
class Counter
{
    static int count = 0; //in the 1st iteration it will change to 1 and stay with 1
    int instanceNumber = 0; //in the 1st iteration it will change to 1 and return to 0


    public Counter()
    {
        count++;
        instanceNumber++;
    }
}
public class challengeTwo
{
    public static void main(String[] args)
    {
        System.out.println("This is the Challenge two!");

        System.out.println();

        Counter c1 = new Counter();
        System.out.println(c1.count);
        System.out.println(c1.instanceNumber);

        Counter c2 = new Counter();
        System.out.println(c2.count);
        System.out.println(c2.instanceNumber);

        Counter c3 = new Counter();
        System.out.println(c3.count);
        System.out.println(c3.instanceNumber);





    }
}

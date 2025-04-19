package functions;

public class addition 
{
    int a = 10;
    int b = 20;

    void sum()
    {
        int sum = a+b;
        System.out.println("the sum of "+a+" and "+b+ " is: "+sum);
    }

    public static void main(String[] args) 
    {
        System.out.println("this is addition!");

        addition call = new addition();
        call.sum();
        
    }
    
}

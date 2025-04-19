package challenges.challenge4;
import java.util.Scanner;

public class find
{

    void evenOrOdd(int num)
    {
        if(num%2==0)
        {
            System.out.println("This is even number");
        }
        else{
            System.out.println("This is odd.");
        }

    }

    public static void main(String[] args) 
    {
        System.out.println("Hiii..");

        System.out.println("Enter the input for Integer ");

        Scanner input = new Scanner(System.in);

        int integer = input.nextInt();

        find obj = new find();

        obj.evenOrOdd(integer);



        
    }
    
}

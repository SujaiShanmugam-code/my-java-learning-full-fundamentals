package challenges.challenge4;
import java.util.Scanner;

public class school 
{

    String passOrFail(int totalMark)
    {
     
     return totalMark >= 50 ? "Pass!" : "Fail.";

    }
    public static void main(String[] args) 
    {
        System.out.println("This is school.");

        System.out.println("Enter your mark , it will say pass or fail");

        Scanner input = new Scanner(System.in);

        int totalMark = input.nextInt();

        school obj = new school();

       String finalResult = obj.passOrFail(totalMark);

       System.out.println(finalResult);


        
    }
    
}

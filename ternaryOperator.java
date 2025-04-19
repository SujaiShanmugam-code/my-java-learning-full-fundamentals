import java.util.Scanner;

public class ternaryOperator 
{
    public static void main(String[] args) 
    {
        // int a = 1000;
        // int b =  20;

        // boolean c = a > b;

        // String result = c ? "a is greater than b" : "b is greater than a";
        // System.out.println(result);

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the 1st number");
        int number1 = input.nextInt();
        System.out.println("Enter the 2nd number");
        int number2 = input.nextInt();

        System.out.println("The 1st number is : "+ number1);
        System.out.println("The 2nd number is : "+ number2);

        
        boolean compa = number1 > number2;

        String result = compa ? "number 1 is greater" : "number 2 is greater" ;

        System.out.println(result);









        
    }
    
}

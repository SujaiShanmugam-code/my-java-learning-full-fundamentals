package challenges;
import java.util.Scanner;

public class challenge3partII 
{
    public static void main(String[] args) {
        
        // int[] marks = new int[5];

        // Scanner input = new Scanner(System.in);

        // for(int i=0; i<marks.length ; i++)
        // {
        //     marks[i] = input.nextInt();
        // }

        // for(int i =0 ; i<marks.length;i++)
        // {
        //     System.out.println(marks[i]);
        // }

        // int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        // for(int i=0; i<numbers.length;i++)
        // {
        //     System.out.println(numbers[i]);
        // }

        // int answer=0;

        // for(int i=1;i<=10;i++)
        // {
        //     answer=i*2;

        //     System.out.println(i+" x 2 ="+ answer);
        // }

       Scanner input = new Scanner(System.in);

       int size = input.nextInt();

       int[] numbers = new int[size];

       for(int i=0; i<numbers.length;i++)
       {

         numbers[i] =input.nextInt();
       
       }

       int middle = size/2;

       System.out.println(numbers[middle]);



        


 
    }
    
}

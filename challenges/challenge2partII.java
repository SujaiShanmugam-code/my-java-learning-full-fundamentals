package challenges;
import java.util.Scanner;

public class challenge2partII 
{
    public static void main(String[] args)
     
    {

        // Scanner input = new Scanner(System.in);

        // int score = input.nextInt();

        // if(score<50)
        // {
        //     System.out.println("you need to improve");
        // }

        // else if(score >=50 && score <=70)
        // {
        //     System.out.println("good job");
        // }
        // else if(score > 70)
        // {
        //     System.out.println("excellent perfomance.");
        // }

        //  Scanner input = new Scanner(System.in);

        //  int tamil = input.nextInt();
        //  int english = input.nextInt();
        //  int maths = input.nextInt();
        //  int social = input.nextInt();
        //  int science = input.nextInt();

        //  System.out.println("your tamil mark is: "+tamil);
        //  System.out.println("your english mark is: "+english);
        //  System.out.println("your maths mark is: "+maths);
        //  System.out.println("your social mark is: "+social);
        //  System.out.println("your science mark is: "+science);

        //  int avgMark = (tamil + english + maths + social +science)/5;

        //  System.out.println("Your avergae mark is" +avgMark);

        //  if(avgMark < 35)
        //  {
        //     System.out.println("Additional class required");
        //  }

        //  else{
        //     System.out.println("You are good to go");
        //  }


        // Scanner input = new Scanner(System.in);

        // String color = input.nextLine();

        // if(color.equals("red"))
        // {
        //     System.out.println("Stop.");
        // }
        // else if(color.equals("yellow"))
        // {
        //     System.out.println("Get ready!");
        // }
        // else if(color.equals("green"))
        // {
        //     System.out.println("Go...");
        // }
        // else
        // {
        //     System.out.println("red or yellow or green , is valid so type this.");
        // }


        Scanner input = new Scanner(System.in);

        System.out.println("Enter you salary");
        int salary = input.nextInt();
        System.out.println("Enter you age");
        int age = input.nextInt();

        System.out.println("You salary is :" +salary);
        System.out.println("You age is :" +age);

        if(salary<=20000 || age<=25)
        {
            System.out.println("enter the loan amount");
            Scanner input1 = new Scanner(System.in);

            int loan = input1.nextInt();

            if(loan <= 50000)
            {
                System.out.println("you are eligible for loan.");
            }
            else if(loan > 50000)
            {
                System.out.println("Maximum loan amount is 50,000.");
            }



        }
        else{
            System.out.println("Not eligible for loan");
        }
        

        
    }
    
}

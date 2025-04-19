import java.util.Scanner;

public class arrays 
{
    public static void main(String[] args) 
    {
        
        // String[] movie = new String[3];

        // movie[0] = "Leo";
        // movie[1] = "Goat";
        // movie[2] = "GBU";

        // // movie[3] = "Jananayagan";


        // System.out.println(movie[1]);

        // String[] place = {"riga" , "madukkur" , "chennai"};

        // System.out.println(place[0]);

        // int[] arr = {1,2,3,4,5};

        // int total = arr[0] + arr[1] + arr[2] + arr[3]+ arr[4];

        // System.out.println(total);

        int[] numbers = new int[5];

        Scanner input = new Scanner(System.in);

        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        numbers[2] = input.nextInt();
        numbers[3] = input.nextInt();
        numbers[4] = input.nextInt();

        int total = 0;

        for(int i=0;i<numbers.length;i++)

        {
            total+=numbers[i];
            
        }

        System.out.println(total);

        


        

    }
    
}

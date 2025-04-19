package functions;
public class garden 
{

    int apple_price = 20;
    int apple_count = 5;

    void totalMoney()
    {
       int totalAmount =  apple_count * apple_price;

       System.out.println("the total amount is : "+ totalAmount);
    }
    public static void main(String[] args)
     
    {
        System.out.println("this is garden!");

        System.out.println(); // for extra spacing.

        garden  obj = new garden();
        obj.totalMoney();


        
    }
    
}

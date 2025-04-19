package functions;
public class mobile 
{

    static void iphone()
    {
        System.out.println("This is Iphone");
    }

    void samsung()
    {
        System.out.println("This is Samsung");
    }

    void oppo()
    {
        System.out.println("This is Oppo");

    }

    void redmi()
    {
        System.out.println("This is Redmi");
    }


    public static void main(String[] args) 
    {
        System.out.println("This is mobile main class!");

        iphone();

        mobile call = new mobile();

        call.samsung();
        call.oppo();
        call.redmi();
        
    }
    
}

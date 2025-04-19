package functions;

//parameter , arguments.


public class store 
{

    void getSoap(int money)
    {
        if(money >=20)

        {       
            System.out.println("Soap purchased!");

        }
        else{
            System.out.println("Not enough more , to buy a soap you should  have atleast 20$.");
        }


 
    }


    void getChocolate( int money)
    {
        System.out.println("chocoloate purchased.");
    }
    public static void main(String[] args) 
    {
        System.out.println("this is store");

        store obj = new store();
        obj.getSoap(10);

        obj.getChocolate(10);
        
    }
    
}

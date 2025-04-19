public class methodwithParameter 
{

    void call()
    {
        System.out.println("one");
    }

    void call(int a)
    {
        System.out.println(a);
    }

    public static void main(String[] args) 
    {
        methodwithParameter obj = new methodwithParameter();
        obj.call();
        obj.call(10);
        
    }
    
}

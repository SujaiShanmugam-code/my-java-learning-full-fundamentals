package functions;
public class func 
{

    String getName(String name)
    {
        return name;
    }

    

    // int sum(int a , int b)
    // {
    //     int sum = a+b;
    //     return sum;

    // }
    public static void main(String[] args) 
    {
        System.out.println("this is main!");

        func obj = new func();

       String result =  obj.getName("Sujai");
       System.out.println(result);



        // func obj = new func();
        // int answer =  obj.sum(1,1);
        // System.out.println(answer);
    }
    
}

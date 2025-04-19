package functions;
public class sum 
{

    void add(int a, int b)
    {
        System.out.println("this is add function.");
        int addition = a+b;

        System.out.println("the addition is :"+ addition);
    }


    void divide(int a, int b)
    {
       float division = a/b;

        System.out.println(division);
    }
    public static void main(String[] args) 
    {
        System.out.println("this is sum.");

        sum obj = new sum();

        obj.add(2,2);

        obj.divide(3, 2);
        
    }
}

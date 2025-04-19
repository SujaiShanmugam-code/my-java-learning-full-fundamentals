package classAndObjects;


public class laptop 
{

    String name= "";
    String processor= "";
    String ram= "";
    int price= 0;

    public static void main(String[] args) 
    {
        
        //syntax for creatng an obj
        laptop lap1 = new laptop();

        lap1.name ="lenova";
        lap1.price = 12000;
        lap1.processor = "AMDRyzen";
        lap1.ram ="4GB";

        System.out.println(lap1.name);
        System.out.println(lap1.ram);

        laptop lap2 = new laptop();

        lap2.name ="macbook";
        lap2.price= 25000;
        lap2.processor = "M1";
        lap2.ram= "6GB";

        System.out.println(lap2.name);
        System.out.println(lap2.processor);
        
    }
    
}

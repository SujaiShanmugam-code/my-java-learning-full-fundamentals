package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;

// for this Write File
public class MainClassFour {

    public static void main(String[] args)
    {
        System.out.println("This is for File Writing!.");


        try
        {
            FileWriter fw = new FileWriter("output.txt" ,true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hello Everyone!");
            bw.newLine();
            bw.write("Superr uhh!!");
            bw.close();


//            fw.append("Hi Sujai Shanmugam - 231ADB016!");
//            fw.close();
            System.out.println("Success!");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finished.");

        }






    }
}

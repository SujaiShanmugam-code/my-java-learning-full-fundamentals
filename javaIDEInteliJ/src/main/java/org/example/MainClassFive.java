package org.example;


import java.io.*;

// for this Read File
public class MainClassFive {

    public static void main(String[] args)
    {
        System.out.println("This is for File Reading!.");


        try
        {
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null)
            {
                System.out.println(line);
                line = br.readLine();
            }

//            int c = fr.read();
//            while(c!=-1)
//            {
//                System.out.print((char)c);
//                c = fr.read();
//
//            }
//
//            fr.close();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

         finally
        {
            System.out.println();
            System.out.println("-----------");
            System.out.println("Finished!");
        }






    }
}

package org.example;


interface File
{
    void showFile();
}
public class MainClassThree
{
    public static void main(String[] args)
    {
        System.out.println("This is Functional Interface!");
        System.out.println();

//        File f1 = ()-> {System.out.println("Hii");};

        File f1 = new File() {
            @Override
            public void showFile() {
                System.out.println("It has 100 data!");
            }
        };

        f1.showFile();

    }
}

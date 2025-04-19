package org.example.exercises;


interface Readable
{
  void read();
}

interface Writeable
{
    void write();
}

interface Storable
{
    void store();
}

class File implements Readable,Writeable,Storable
{
    @Override
    public void read()
    {
        System.out.println("Read!");
    }

    @Override
    public void write() {
        System.out.println("Write!");
    }

    @Override
    public void store() {
        System.out.println("Store");
    }
}



public class exerciseFive
{
    public static void main(String[] args)
    {
        System.out.println("This is Exercise Five!");

        System.out.println();

        File f1 = new File();

        f1.read();
        f1.write();
        f1.store();

    }
}

package org.example;

// for this keyword.
public class Singer {

    String singerName;

    public String getSingerName()
    {
        return singerName;
    }

    public void setSingerName(String singerName)
    {
        this.singerName = singerName;
    }

    public Singer()
    {
        System.out.println("Singer Constructor Created.");
    }

    public static void main(String[] args)
    {
        System.out.println("This is Singer.");

        Singer obj = new Singer();

        obj.setSingerName("ARRahman");
        System.out.println(obj.getSingerName());

//        System.out.println(obj.singerName);


    }
}

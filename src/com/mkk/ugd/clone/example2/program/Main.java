package com.mkk.ugd.clone.example2.program;

/*
    Shallow copy olduğu için,
    ref tip değişkendeki değişiklik yansır.
 */
public class Main
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Deneme2 deneme1 = new Deneme2();
        deneme1.a = 10;
        deneme1.b = 20;
        deneme1.c.x = 30;
        deneme1.c.y = 40;


        Deneme2 deneme2 = (Deneme2)deneme1.clone();

        // Creating a copy of object t1
        // and passing it to t2
        deneme2.a = 100;

        // Change in primitive type of t2 will
        // not be reflected in t1 field
        deneme2.c.x = 300;

        // Change in object type field will be
        // reflected in both t2 and t1(shallow copy)
        System.out.println(deneme1.a + " " + deneme1.b + " " + deneme1.c.x
                + " " + deneme1.c.y);
        System.out.println(deneme2.a + " " + deneme2.b + " " + deneme2.c.x
                + " " + deneme2.c.y);
    }
}

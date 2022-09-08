package com.mkk.ugd.clone.example3.program;

public class Deneme2
{
    int a, b;
    Deneme1 c = new Deneme1();

    /*
        Deep copy'de, clone metodunda
        ref. tip sınıf değ. için de tekrar klonlama yapıldı
        ve bu klon döndürüldü.
     */
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        // Assign the shallow copy to
        // new reference variable t
        Deneme2 t = (Deneme2)super.clone();

        // Creating a deep copy for c
        t.c = new Deneme1();
        t.c.x = c.x;
        t.c.y = c.y;

        // Create a new object for the field c
        // and assign it to shallow copy obtained,
        // to make it a deep copy
        return t;
    }
}

package com.mkk.ugd.clone.example2.program;

import com.mkk.ugd.clone.example1.program.Deneme1;

public class Deneme2 implements Cloneable
{
    int a;
    int b;
    Deneme1 c = new Deneme1();

    // shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

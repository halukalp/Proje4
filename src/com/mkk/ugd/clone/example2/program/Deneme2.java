package com.mkk.ugd.clone.example2.program;

import com.mkk.ugd.clone.example1.program.Deneme;

public class Deneme2 implements Cloneable
{
    int a;
    int b;
    Deneme c = new Deneme();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

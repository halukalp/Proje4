package com.mkk.ugd.clone.example1.program;

// Birindeki bir değişiklik diğerne yansır (reflect);
// çünkü aynı adresi işaret ediyorlar.
class Main {
    public static void main(String[] args)
    {
        Deneme1 deneme1 = new Deneme1();

        System.out.println(deneme1.x + " " + deneme1.y);

        // Creating a new reference variable ob2
        // pointing to same address as ob1
        Deneme1 deneme2 = deneme1;

        // Any change made in ob2 will
        // be reflected in ob1
        deneme2.x = 100;

        System.out.println("\n");
        System.out.println(deneme1.x + " " + deneme1.y);
        System.out.println(deneme2.x + " " + deneme2.y);
    }
}

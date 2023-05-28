package com.company;

public class Suma implements IMethods {

    @Override
    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Suma Suma = new Suma ();
        int sum = Suma.sum(100, 200, 300, 400);
        System.out.println("Vkupnata suma na zadadenite vrednosti e " +sum );
    }

}



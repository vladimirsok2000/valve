package com.company;

public class Main {

    public static void main(String[] args) {
        SredenProtok SrednaVrednost = new SredenProtok();

        int sum = SrednaVrednost.sum(1000, 1200, 1000, 2500);
        //System.out.println("vnupna suma na protoci = " + sum);

        double divide = SrednaVrednost.divide(sum, 4);
        System.out.println("sredna vrednost na protoci za izvrseni 4 merenja = " +divide+ " (lit/min) ");

    }

}
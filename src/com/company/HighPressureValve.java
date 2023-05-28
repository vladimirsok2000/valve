package com.company;

public class HighPressureValve {
    Integer valvePressure;
    boolean valvePosition = false;
    // ventilot e (OPEN = neaktiven = false, pri pritisok do 20bar)
    // ili (SHUT OFF = aktiven = true, pri pritisok nad 20bar)

    void Pressure() {
        if (valvePressure < 20)
            System.out.println("The valve is already OPEN - valve pressure less than 20 bar");
        else {
            valvePosition = true;
            System.out.println("the valve is SHUT OFF - valve pressure more than 20 bar ");
        }

    }
    void showAtts() {
        System.out.println("the pressure is " +valvePressure+ " bar");
    }

    public static void main(String[] args) {
        HighPressureValve valve = new HighPressureValve();
        valve.valvePressure = 19;
        System.out.println("***********************");
        //System.out.println("calling method Pressure");
        valve.showAtts();
        valve.Pressure();
        System.out.println("***********************");
        valve.valvePressure = 21;
        System.out.println("***********************");
        //System.out.println("calling method Pressure");
        valve.showAtts();
        valve.Pressure();
        System.out.println("***********************");

    }
}


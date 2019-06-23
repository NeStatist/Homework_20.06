package com.company.number;

import java.util.Scanner;

public class Real extends Number {

    Scanner sc = new Scanner(System.in);

    private double a, b;

    public void setNum(){
        System.out.println("Enter real A: ");
        a = sc.nextDouble();

        System.out.println("Enter real B: ");
        b = sc.nextDouble();
    }


    @Override
    public String addition() {

        double rez = a + b;
        String str = Double.toString(rez);
        System.out.println("A + B = " + str);
        return str;
    }

    @Override
    public String subtraction() {

        double rez = a - b;
        String str = Double.toString(rez);
        System.out.println("A - B = " + str);
        return str;
    }

    @Override
    public String multiplication() {

        double rez = a * b;
        String str = Double.toString(rez);
        System.out.println("A * B = " + str);
        return str;
    }

    @Override
    public String division() {

        double rez = a / b;
        String str = Double.toString(rez);
        System.out.println("A / B = " + str);
        return str;
    }

    @Override
    public String sqrt() {

        double rez1 = Math.sqrt(a);
        double rez2 = Math.sqrt(b);
        String str = Double.toString(rez1);
        System.out.println("sqrt A = " + rez1 +"\nsqrt B = " + rez2);
        return str;
    }
}

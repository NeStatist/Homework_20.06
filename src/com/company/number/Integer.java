package com.company.number;

import com.company.Main;

import java.util.Scanner;

public class Integer extends Number {

    Scanner sc = new Scanner(System.in);

    private int a, b;

    public void setNum(){
        System.out.println("Enter integer A: ");
        a = sc.nextInt();

        System.out.println("Enter integer B: ");
        b = sc.nextInt();
    }

    @Override
    public String addition() {

        int rez = a + b;
        String str = Double.toString(rez);
        System.out.println("A + B = " + str);
        return str;
    }

    @Override
    public String subtraction() {

        int rez = a - b;
        String str = Double.toString(rez);
        System.out.println("A - B = " + str);
        return str;
    }

    @Override
    public String multiplication() {

        int rez = a * b;
        String str = Double.toString(rez);
        System.out.println("A * B = " + str);
        return str;
    }

    @Override
    public String division() {

        int rez = a / b;
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

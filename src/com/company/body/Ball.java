package com.company.body;

import java.util.Scanner;

public class Ball extends Body {

    Scanner sc = new Scanner(System.in);

    private int r;

    public void setNum() {
        System.out.println("Enter radius of ball: ");
        r = sc.nextInt();
    }

    @Override
    public double surfaceArea() {

        double res = 4 * Math.PI * (r*r);
        System.out.println("Surface Area of ball = " + res);
        return res;
    }

    @Override
    public double volume() {

        double res = (4 * Math.PI * (r*r*r))/3;
        System.out.println("Volume of ball = " + res);
        return res;
    }
}

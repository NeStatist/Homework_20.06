package com.company.body;

import java.util.Scanner;

public class Parallepiped extends Body {

    Scanner sc = new Scanner(System.in);

    private int a, b, h;

    public void setNum() {
        System.out.println("Enter width of parallelepiped: ");
        a = sc.nextInt();

        System.out.println("Enter length of parallelepiped: ");
        b = sc.nextInt();

        System.out.println("Enter height of parallelepiped: ");
        h = sc.nextInt();
    }

    @Override
    public double surfaceArea() {

        double res = 2*(h*b + b*a + a*h);
        System.out.println("Surface Area of parallelepiped = " + res);
        return res;
    }

    @Override
    public double volume() {

        double res = a * b * h;
        System.out.println("Volume of parallelepiped = " + res);
        return res;
    }
}

package com.company.figure;

import java.util.Scanner;

public class Circle extends Figure {

    Scanner sc = new Scanner(System.in);
    private double r;

    public void setR(){
        System.out.println("Enter radius of circle: ");

        r = sc.nextDouble();
    }

    @Override
    public double square() {
        double rez = Math.PI*r*r;
        System.out.println("Square: " + rez);
        return rez;
    }

    @Override
    public double perimeter() {
        double rez = 2 * Math.PI * r;
        System.out.println("Perimeter: " + rez);
        return rez;
    }
}

package com.company.figure;

import java.util.Scanner;

public class Trapezium extends Figure {

    Scanner sc = new Scanner(System.in);

    private double leftSide, topSide, rightSide, bottomSide, height;

    public void setSide(){
        System.out.println("Enter left side of Trapezium: ");
        leftSide = sc.nextDouble();

        System.out.println("Enter top side of Trapezium: ");
        topSide = sc.nextDouble();

        System.out.println("Enter right side of Trapezium: ");
        rightSide = sc.nextDouble();

        System.out.println("Enter bottom side of Trapezium: ");
        bottomSide = sc.nextDouble();

        System.out.println("Enter height side of Trapezium: ");
        height = sc.nextDouble();
    }

    @Override
    public double square() {
        double rez = ((topSide + bottomSide)*height)/2;
        System.out.println("Square: " + rez);
        return rez;
    }

    @Override
    public double perimeter() {
        double rez = leftSide + topSide + rightSide + bottomSide;
        System.out.println("Perimeter: " + rez);
        return rez;
    }
}

package com.company.figure;

import java.util.Scanner;

public class Rectangle extends Figure {

    Scanner sc = new Scanner(System.in);

    private double width;
    private double height;

    public void setWH (){
        System.out.println("Enter width of Rectangle: ");
        width = sc.nextDouble();

        System.out.println("Enter height of Rectangle: ");
        height = sc.nextDouble();
    }

    @Override
    public double square() {

        double res = width * height;
        System.out.println("Square: " + res);
        return res;
    }

    @Override
    public double perimeter() {

        double res = (width * 2 + height * 2);
        System.out.println("Perimeter: " + res);
        return res;
    }
}

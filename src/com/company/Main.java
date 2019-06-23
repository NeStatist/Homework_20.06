package com.company;

import com.company.body.Ball;
import com.company.body.Parallepiped;
import com.company.figure.Circle;
import com.company.figure.Rectangle;
import com.company.figure.Trapezium;
import com.company.number.Real;
import com.company.number.Integer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        Circle circle = new Circle();
        Trapezium trapez = new Trapezium();

        Integer inter = new Integer();
        Real real = new Real();

        Parallepiped paral = new Parallepiped();
        Ball ball = new Ball();

        Scanner sc = new Scanner(System.in);

        System.out.print("\nChoose class to work:" +
                "\n 1.Figure;" +
                "\n 2.Number;\n");

        int N  = sc.nextInt();

        switch (N){
            case 1:

                System.out.print("\nChoose figure:" +
                        "\n 1.Rectangle;" +
                        "\n 2.Circle;" +
                        "\n 3.Trapezium." +
                        "\n\n 4.Parallelepiped." +
                        "\n 5.Ball.\n");

                N  = sc.nextInt();

                switch (N){
                    case 1:
                        rec.setWH();
                        rec.square();
                        rec.perimeter();

                        break;

                    case 2:
                        circle.setR();
                        circle.square();
                        circle.perimeter();

                        break;

                    case 3:
                        trapez.setSide();
                        trapez.square();
                        trapez.perimeter();

                        break;

                    case 4:
                        paral.setNum();
                        paral.surfaceArea();
                        paral.volume();

                        break;

                    case 5:
                        ball.setNum();
                        ball.surfaceArea();
                        ball.volume();

                        break;
                }

                break;

            case 2:
                System.out.print("\nChoose numbers: " +
                        "\n 1.Integer;" +
                        "\n 2.Real;" );

                N = sc.nextInt();

                switch (N){
                    case 1:
                        inter.setNum();
                        inter.addition();
                        inter.subtraction();
                        inter.multiplication();
                        inter.division();
                        inter.sqrt();

                        break;

                    case 2:
                        real.setNum();
                        real.addition();
                        real.subtraction();
                        real.multiplication();
                        real.division();
                        real.sqrt();

                        break;
                }

        }

    }
}

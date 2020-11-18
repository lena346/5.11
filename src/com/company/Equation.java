package com.company;

public class Equation {
    public static double  solve(double a, double b){
        if(b - a <= 0.001){
            return a;
        }

        double x = a + (b - a) / 2;

        if(func(a) * func(x) > 0){
            return solve(x, b);
        } else {
            return solve(a, x);
        }
    }

    public static double func(double x){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    public static void main(String[] args) {
        System.out.println(solve(0, 10));
    }
}

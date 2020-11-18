package com.company;

import java.io.Serializable;

public class Recurcion {
    public static Serializable rec(int n) {
        if (n <= 1) {
            return n;
        }
        return rec(n - 1) + " " + n;
    }

    public static void main(String[] args) {
        System.out.println(rec(10));

    }
}

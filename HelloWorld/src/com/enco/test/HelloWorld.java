package com.enco.test;

import java.util.Scanner;

//demo test HelloWorld
public class HelloWorld {
    public static void main(String[] args) {
        /*
        print Hello World
        */

        //print Hello World
        System.out.println("Hello World!");
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int x = add(a,b);
        System.out.println( x);
        sc.close();
    }

    public static int add(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
}

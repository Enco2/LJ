package com.enco.test;

import javax.print.DocFlavor;
import java.util.Scanner;

//demo test HelloWorld
public class HelloWorld {
    public static void main(String[] args) {
        /*
        print Hello World
        */

        //print Hello World
        /*System.out.println("Hello World!");
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int x = add(a,b);
        System.out.println( x);
        sc.close();

        char ch = 'a';
        System.out.println(ch);
        String str = "hello world";
        System.out.println(str);
        int i = 10;
        System.out.println(i);
        float f = 10.1f;
        System.out.println(f);
        double d = 10.1;
        System.out.println(d);
        boolean bool = true;
        System.out.println(bool);
        */

        String name = "霸王龙";
        int age = 8;
        double height = 11.5;
        char sex = '公';
        System.out.println("姓名：" + name + "\n" + "年龄：" + age + "\n" + "身高：" + height + "\n" + "性别：" + sex);
    }

    public static int add(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
}

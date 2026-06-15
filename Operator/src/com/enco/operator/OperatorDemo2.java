package com.enco.operator;

import java.util.Scanner;

public class OperatorDemo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒数：");
        int seconds = sc.nextInt();

        operatorDemo2(seconds);

        /*int hours = seconds / 3600;
        seconds = seconds - hours * 3600;
        int minutes = seconds / 60;
        seconds = seconds - minutes * 60;
        System.out.println(hours + " " + minutes + " " + seconds);
        */
    }

    public static void operatorDemo2(int x) {
        int hours = x / 3600;
        int minutes = x % 3600 / 60;
        int seconds = x % 3600 % 60;
        System.out.println(hours + " " + minutes + " " + seconds);
    }

}

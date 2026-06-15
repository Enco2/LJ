package com.enco.operator;

import java.util.Scanner;

public class OperatorDemo1 {
    public static void main(String[] args) {
         //需求：键盘录入一个三位数，将其拆分为个位、十位、百位，打印在控制台
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println("个位：" + ge);
        System.out.println("十位：" + shi);
        System.out.println("百位：" + bai);
    }
}

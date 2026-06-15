package com.enco.variable;

import java.util.Scanner;

public class VariableDemo4 {

    public static void main(String[] args) {

        //BMI = 体重 / (身高 * 身高)
        double bmi = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高：");
        double h = sc.nextDouble();
        System.out.println("请输入体重：");
        double w = sc.nextDouble();

        bmi = w / (h * h);

        if (bmi < 18.5) {
            System.out.println(bmi + "身体状态：消瘦;健康风险：部分增加"  );
        } if (18.5 <= bmi && bmi < 23.9) {
            System.out.println(bmi + "身体状态：正常;健康风险：正常");
        } if (24.0 <= bmi && bmi < 26.9) {
            System.out.println(bmi + "身体状态：偏旁;健康风险：增加");
        } if (27.0 <= bmi && bmi < 29.9) {
            System.out.println(bmi + "身体状态：肥胖;健康风险：中度增加");
        } else if (bmi >= 30.0) {
            System.out.println(bmi + "身体状态：严重肥胖;健康风险：严重增加");
        }

        sc.close();
    }
}

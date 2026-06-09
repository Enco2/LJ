package com.enco.variable;

public class VariableDemo1 {
    /*
    1.微信余额：0元
    2.支付宝余额：10元
    3.银行卡余额：20元
    问题一：请问现在一共有多少元？
    问题二：微信收了10元红包，又发了2元红包，余额多少？
    */
    public static void main(String[] args) {

        double wechat = 0;
        double alipay = 10;
        double bank = 20;
        System.out.println("现在一共有" + (wechat + alipay + bank) + "元");
//        wechat = wechat + 10 - 2;
        wechat += 10-2;
        System.out.println("微信余额:" + wechat);

    }
 }

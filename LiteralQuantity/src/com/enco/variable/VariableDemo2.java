package com.enco.variable;

public class VariableDemo2 {

    public static void main(String[] args) {

        //role 1
        int attack1 = 220;
        int defense1 = 85;
        double hp1 = 1012.5;
        double mp1 = 1.2;

        //role 2
        int attack2 = 210;
        int defense2 = 80;
        double hp2 = 1223.3;
        double mp2 = 1.3;

        //First Battle
        double damage1 = attack1 - defense2;
        hp2 = hp2 - damage1;
        System.out.println("我方第一次普通攻击，造成" + damage1 + "伤害，对方剩余" + hp2 + "生命值");

        //Second Battle
        double damage2 = attack1 * mp1 - defense2;
        hp2 = hp2 - damage2;
        System.out.println("我方第二次技能攻击，造成" + damage2 + "伤害，对方剩余" + hp2 + "生命值");
    }
}

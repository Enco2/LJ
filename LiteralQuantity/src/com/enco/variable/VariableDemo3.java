package com.enco.variable;

public class VariableDemo3 {
    /*
      定义8种基本数据类型的变量：

      整数类型：byte short int long
      浮点数类型：float double
      字符类型：char
      布尔类型：boolean
    */
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        float e = 3.4028235E38f;
        double f = 1.7976931348623157E308;
        char g = 'a';
        boolean h = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}

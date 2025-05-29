package day1;

import day7.TestInterface;

public class Demo {
    public static void main(String[] args){
        System.out.println(TestInterface.name);
        //TestInterface.name="李四";
        //1.自动类型提升   小==>大
        int num1=100;
        long num2=200;
        long num3=num1; //自动变成long
        //      int+long==>long
        int num4=(int)(num1+num2);
        double d1=15.5;
        //int+long+double===>double
        double num5=num1+num2+d1;
        //int+double+String==>String
        String s1="java";
        String result=num1+d1+s1;  //拼接在一起 形成字符串
        System.out.println("结果是："+result);

        //2.强制类型转换    大==>小    java默认不支持  因为丢失精度
        double d2=15.5;
        int d3=100;
        int d4=(int)d2;
    }
}

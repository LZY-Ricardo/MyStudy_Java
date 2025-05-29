package day4;

import day5.MyInterface;

//char类型
public class Demo {
    public static void main(String[] args) {
        //1.赋值单个字符
        char c1='a';
        char c2='=';
        //char c3='ab';  错误的

        //2.赋值ascii
        char c3=122;  //z
        char c4=57;   //9

        //3.赋值unicode
        char c5='\u8888';
        char c6='\u7777';
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        //MyInterface.name="abcd";
        System.out.println(MyInterface.name);
        System.out.println(MyInterface.sex);
    }
}

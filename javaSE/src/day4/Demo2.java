package day4;

import java.util.Arrays;

//静态变量
public class Demo2{
    int num;
    static int num2;
    public void print(){
        System.out.println(num+" "+num2);
    }
    //普通方法: 可以调用普通属性和方法  静态方法和属性也可以
    public void test(){
        System.out.println(num);
        System.out.println(num2);
        test2();
    }
    //静态方法 只能使用静态变量和静态方法
    public static void test2(){
        //System.out.println(num);
        System.out.println(num2);
        //test();
        test3();
    }
    public static void test3(){

    }
    public static void main(String[] args) {
        Demo2 d=new Demo2();
        d.print();
        d.num=10;
        d.num2=100;
        Demo2 d2=new Demo2();
        d.print(); //10  100
        d2.print();//0   100
        System.out.println(d.num);
        //静态变量 可以多个对象共享同一个
        System.out.println(d.num2);
        //静态 属于类的  推荐通过类名访问
        System.out.println(Demo2.num2);
        //System.out.println(Demo2.num);
        d.test();
        d.test2();
        d.test3();
        Demo2.test2();
        Demo2.test3();
        //Arrays.toString(数组);
        Math.random();
        Math.floor(1);
    }
}

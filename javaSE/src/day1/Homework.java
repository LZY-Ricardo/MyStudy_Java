package day1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework {
    //main方法入口
    public static void main(String[] args) {
        int a=(int)15.5;
        double b=15.5;
        float c=(float)15.5;
        //float  简化版写法
        float d=15.5f;
        demo1();
        demo2();
        demo3();
    }

    /**
     * b.编写程序,显示一下公式的结果
     * 9.5*4.5-2.5*3
     * --------------   -->这是除号
     *    45.5-3.5
     */
    public static void demo1(){
        double result=(9.5*4.5-2.5*3)/(45.5-3.5);
        DecimalFormat df=new DecimalFormat("0.00");
        String str=df.format(result);
        System.out.println("9.5*4.5-2.5*3");
        System.out.println("--------------   -->这是除号");
        System.out.println("  45.5-3.5");
        System.out.println(str);
    }

    /**
     * a.实现一个数字加密器，加密规则是：
     *     加密结果 = （整数*10+5）/2 + 3.14159，加   密结果仍为一整数
     */
    public static void demo2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入整数：");
        int num=sc.nextInt();
        //java有一种类Math 专门可以完成一些数学运算的
        double math=(num*10+5)/2+3.14159;
        //long result=Math.round(math) long
        int result=Math.round((num*10+5)/2+3.14159f);
        System.out.println("加密前的数字："+num);
        System.out.println("加密后的数字："+result);

    }

    /**
     * b.假设一个跑步者4分钟30秒内跑了14公里。
     * 编写一个程序显示每小时多少英里为单位的平均速度只(1英里等于1.6公里)
     */
    public static void demo3(){
        DecimalFormat df=new DecimalFormat("0.00");
        double speed=14/4.5*60;
        System.out.println("每小时公里："+df.format(speed));
        double speed2=speed/1.6;
        System.out.println("每小时英里："+df.format(speed2));
    }
}

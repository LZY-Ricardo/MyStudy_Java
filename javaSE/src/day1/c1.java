package day1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("STB的成绩是：");
        double n1 = sc.nextDouble();
        System.out.print("Java的成绩是：");
        double n2 = sc.nextDouble();
        System.out.print("SQL的成绩是：");
        double n3 = sc.nextDouble();
        System.out.println("------------------------------");
        System.out.println("STB\t\tJava\tSQL");
        System.out.println(n1 +"\t"+n2+"\t"+n3);
        System.out.println("------------------------------");
        double cha = n2 - n3;
        System.out.print("Java和SQL的成绩差：");
        System.out.println(cha);
        System.out.print("3门课的平均分：");
        //实现数字格式化 而且保留小数点1位
        DecimalFormat df = new DecimalFormat("#.#");
        double avg =(n1+n2+n3)/3;
        String result=df.format(avg);
        System.out.println(result);
    }
}

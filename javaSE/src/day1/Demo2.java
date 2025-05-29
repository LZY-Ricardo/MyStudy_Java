package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args){
        //1.创建对象(定义变量 类型 变量名=对象)
        Scanner sc = new Scanner(System.in);
        //2.利用Scanner对象sc 调用 自带的方法 nextXXX()
        //处于线程阻塞状态 需要等待用户输入输出
        System.out.println("请输入一个字符串：");
        String a = sc.next();//获取字符串 a
        System.out.println("请输入一个整数：");
        int b = sc.nextInt();//获取一个整数 10
        System.out.println("请输入一个浮点数：");
        double c = sc.nextDouble();//获取一个浮点数 50
        System.out.println(a+"\t"+b+"\t"+c);//a 10 50

        System.out.println("请输入你的分数：");
        //sc.hasNextInt() true false 假
        //选择结构 来控制执行流程
        //如果输入的是整数 可以给score赋值
        //反之 需要 提示错误信息
        //if(条件){
        //  如果条件满足了 执行的代码
        //}else{
        //  不满足条件 执行的代码
        //}
        if(sc.hasNextInt()){
            int score = sc.nextInt();
            System.out.println(score);
        }else{
            System.out.println("输入的不是数字");
        }
    }
}
class TestScanner{
    public static void main(String[] args) throws IOException {
        BufferedReader br=
                new BufferedReader(
                        new InputStreamReader(
                                System.in)
                );
        while (true){
            System.out.println("请输入一行数据：");
            String line= br.readLine();
            System.out.println(line);
        }
    }
}
package day2;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //录入5位学生成绩(0-100) 输入错误可以重新输入
        // 统计5人总成绩 统计分数再80以上人数
        Scanner sc=new Scanner(System.in);
        int sum=0;
        boolean b=true;
        int count=0;
        for(int i=0;i<5;i++) {
            System.out.println("输入第"+(i+1)+"名学生成绩");
            int score = sc.nextInt();
            if(score>=0 && score<=100) {
                sum += score;
                //统计80分以上的人
                if(score<=80) continue;
                count++;
            }else{
                //b=false;
                System.out.println("成绩输入有误");
                //break;
                i--;
            }
        }
        if(b) System.out.println("5名学生总成绩:"+sum);
        System.out.println("超过80分人数:"+count);
    }
}

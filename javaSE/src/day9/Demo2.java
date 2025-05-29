package day9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

//输入一个日期 打印出当月的日期格式
//比如:
//一 二 三 四 五 六 日
//      1  2  3  4  5
//...
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入任意日期(年-月-日):");
        String time=sc.next();
        LocalDate ld= LocalDate.parse(time);
        char[] cs={'一','二','三','四','五','六','日'};
        //打印出第一行星期
        for(char c:cs){
            System.out.print(c+"\t");
        }
        System.out.println();//换行
        int week=ld.getDayOfWeek().getValue();
        //再1号前面拼接几个\t
        for(int i=1;i<week;i++){
            System.out.print("\t");
        }
        //遍历 当月的每一号(需要先获取当月一共多少天)
        for(int i=1;i<=ld.lengthOfMonth();i++){
            System.out.print(i+"\t");
            //每到周日才换行
            if(ld.withDayOfMonth(i).getDayOfWeek()== DayOfWeek.SUNDAY) System.out.println();
        }
    }
}

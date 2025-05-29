package day9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

//计算促销日,输入一个生产日期,再输入一个保质期(天)
//促销日 是该商品过期时间的前两周的周三
//计算出 促销日是什么
public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入生产日期(年-月-日):");
        String time=sc.next();
        System.out.println("请输入保质期(天):");
        int day=sc.nextInt();
        //String==>Date  借助于SimpleDateFormat
        //String==>LocalDate  借助于parse()
        LocalDate product= LocalDate.parse(time);
        System.out.println("生产日期:"+product);
        LocalDate overdue=product.plusDays(day);
        System.out.println("过期时间:"+overdue);
        overdue=overdue.minusWeeks(2);
        overdue=overdue.with(DayOfWeek.WEDNESDAY);
        System.out.println("促销日:"+overdue);


        //输入一个日期 打印出当月的日期格式
        //比如:
        //一 二 三 四 五 六 日
        //      1  2  3  4  5
        //...
        System.out.println("请输入日期(年-月-日)：");
        String s=sc.next();
        LocalDate date = LocalDate.parse(s);
        LocalDate one=date.withDayOfMonth(1);
        int dayOfWeek = one.getDayOfWeek().getValue();
        int max=date.getDayOfMonth();
        System.out.println(dayOfWeek);
        System.out.println("一 二 三 四 五 六 日");
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("  ");
        }
        for(int i=1;i<=max;i++){
            one=one.plusDays(1);
            if(one.getDayOfWeek().getValue()==7) System.out.println();
            System.out.printf("%2d ",i);
        }
    }
}

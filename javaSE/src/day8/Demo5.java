package day8;

import java.time.LocalDate;
import java.util.Scanner;

//LocalDate新日期格式
public class Demo5 {
    public static void main(String[] args) {
        LocalDate ld1=LocalDate.now();
        LocalDate ld2=LocalDate.of(2000,10,20);
        System.out.println(ld1);
        System.out.println(ld2);

        //请输入你的生日 计算你今年多大了?
        //LocalDate time=LocalDate.of(1990,9,27);
        Scanner  sc=new Scanner(System.in);
        String time=sc.next();//yyyy-MM-dd
        //String==>LocalDate 注:字符串格式需要满足
        LocalDate time2=LocalDate.parse(time);
        LocalDate now=LocalDate.now();
        int year=time2.until(now).getYears();
        System.out.println(year);
    }
}

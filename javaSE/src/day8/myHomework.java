package day8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class myHomework {
    public static void main(String[] args) {
//        while (true) {
//            test1();
//        }
        //test2();
//        String s="aabcccccaaa";
//        System.out.println(s);
//        s=test3(s);
//        System.out.println(s);
       // test4();
        test5();
    }
    //a.将输入的任意0-999的整数全部补全为三位数输出(不足三位补0)
    public static void test1(){
        System.out.println("请输入0-999的任意整数");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<10){
            System.out.println("00"+num);
        }else if(num<100){
            System.out.println("0"+num);
        }else{
            System.out.println(num);
        }
    }
    //b.在控制台输入字符串和子字符串，并计算字符串中子字符串 出现的次数
    //比如:输入字符串:"abcdfsdfabcdfabcdsf";
    //子字符串:"abc";
    //出现次数:3次
    public static void test2(){
        System.out.println("请输入字符串");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("请输入子字符串");
        String s1=sc.next();
        int count=0;
        int index=0;
        while((index=s.indexOf(s1,index))!=-1){
          count++;
          index += s1.length();
        }
        System.out.println("子字符串"+s1+"在字符串"+s+"中出现了"+count+"次");
    }
    //c.编写一个方法，接受一个字符串作为输入，返回一个“压缩”的版本。
    // 压缩的规则是：如果一个字符重复出现，则该字符后面跟着它的重复次数
    //比如:输入: "aabcccccaaa"      输出: "a2b1c5a3
    public static String test3(String input){
        if(input ==null || input.length()==0) return input;
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<input.length();i++){
            count++;
            if(i+1==input.length()||input.charAt(i+1)!=input.charAt(i)){
                sb.append(input.charAt(i));
                sb.append(count);
                count=0;
            }
        }
        return sb.toString();
    }
    //d.获得一个日期所在的周的星期几的日期，
    //如要找出2023年2月3日所在周的星期一是几号
    public static void test4(){
        System.out.println("请输入日期");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        LocalDate time=LocalDate.parse(s);
        LocalDate monday=time.with(DayOfWeek.MONDAY);
        System.out.println("该日期所在周的星期一为："+monday);
    }
    //e.模拟实现一个记录手机视频时长  每次视频10分钟   第二次累加上一次的时间
    //   结果如下: 通话时长    "10:15:12";
    //比如: 开始通话
    //         已经通过: 00:10:00
    //         是否继续通话(y/n): y
    //         已经通过: 00:20:00
    //         是否继续通话(y/n): n
    //         通话时长: 00:20:00
    public static void test5(){
        Duration time = Duration.ZERO;
        time=time.plusMinutes(10);
        Scanner sc=new Scanner(System.in);
        System.out.println("开始通话");
        while(true){
            System.out.println("已经通过:"+formatDuration(time));
            System.out.println("是否继续通话(y/n)");
            String s=sc.next();
            if(s.equalsIgnoreCase("y")){
                time=time.plusMinutes(10);
            }else if(s.equalsIgnoreCase("n")){
                System.out.println("通话时长:"+formatDuration(time));
                break;
            }
        }
    }
    public static String formatDuration(Duration duration) {
        long hours=duration.toHours();
        long minutes=duration.toMinutes()%60;
        long seconds=duration.getSeconds()%60;
        return String.format("%02d:%02d:%02d",hours,minutes,seconds);
    }
}

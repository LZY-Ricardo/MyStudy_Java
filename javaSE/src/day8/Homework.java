package day8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        test5();
    }
    //a.将输入的任意0-999的整数全部补全
    // 为三位数输出(不足三位补0)
    public static void test1(){
        System.out.println("请输入0-999 一个数字");
        int num=sc.nextInt(); //9
        String s=num+"";
        //if(s.length()>3) return;
        if(s.length()<3){  //009
            int len=s.length();
            for(int i=0;i<3-len;i++){
                s="0"+s;
            }
        }
        System.out.println(s);
    }
    //b.在控制台输入字符串和子字符串，并计算字符串中
    // 子字符串 出现的次数
    //比如:输入字符串:"abcdfsdfabcdfabcdsf";
    //子字符串:"abc";
    //出现次数:3次
    public static void test2(){
        System.out.println("请输入字符串内容:");
        String str=sc.next();
        System.out.println("请输入子字符串内容:");
        String childStr=sc.next();
        int count=0;//次数
        int index=0;//表示开始扫描的下标
        while(true) {
            //1.借助于indexOf("a",从指定下标开始查找);
            /*index = str.indexOf(childStr, index);
            if (index != -1) {//存在
                count++;
                index += childStr.length();
            }else break;  //不存在 结束了*/
            //2.借助于subString()
            //从0开始截取子字符串长度的内容来判断和子串是否相等
            if(str.substring(index,index+childStr.length()).equals(childStr)){
                count++;
                index+=childStr.length();
            }else{
                index++;
            }
            //如果下一次要截取字符串内容超过最大长度 则推出
            if(index+childStr.length()>str.length()) break;
        }
        System.out.println("出现的次数:"+count);
    }
    //c.编写一个方法，接受一个字符串作为输入，
    // 返回一个“压缩”的版本。压缩的规则是：
    // 如果一个字符重复出现，则该字符后面跟着它的重复次数
    //比如:输入: "aabcccccaaa"      输出: "a2b1c5a3
    public static void test3(){
        System.out.println("请输入任意字符串:");
        String s=sc.next();
        String result=compress(s);
        System.out.println(result);
    }
    public static String compress(String s){
        StringBuilder sb=new StringBuilder();
        int count=1;//每个字符 至少1次
        for(int i=1;i<s.length();i++){
            //从第二个字符开始  判断它和前一个字符是否相等
            if(s.charAt(i)==s.charAt(i-1)) count++; //相等+1
            else{ //如果不相等  添加前一个字符 个数
                sb.append(s.charAt(i-1)) ;//先拼接字符
                sb.append(count) ;//再拼接次数
                count=1;//重置
            }
        }
        //处理最后一组字符
        sb.append(s.charAt(s.length()-1));
        sb.append(count);
        return sb.toString();
    }
    //d.获得一个日期所在的周的星期几的日期，
    //如要找出2023年2月3日所在周的星期一是几号   2023-1-30
    public static void test4(){
        LocalDate ld=LocalDate.of(2023,2,3);
        System.out.println(ld);
        //修改日期  修改星期一
        //枚举: 设计模式 单例模式 教你枚举
        //DayOfWeek属于枚举类型 保存很多常量
        ld=ld.with(DayOfWeek.MONDAY);
        System.out.println(ld);
    }
    //e.模拟实现一个记录手机视频时长  00:00
    // 每次视频10分钟   第二次累加上一次的时间
    //   结果如下: 通话时长    "10:15:12";
    //比如: 开始通话
    //         已经通过: 00:10:00
    //         是否继续通话(y/n): y
    //         已经通过: 00:20:00
    //         是否继续通话(y/n): n
    //         通话时才: 00:20:00
    public static void test5(){
        LocalTime lt=LocalTime.MIN;
        Random r=new Random();
        while(true){
            System.out.println("开始通话");
            int mm=r.nextInt(60);//随机分数
            int ss=r.nextInt(60);//随机秒数
            lt=lt.plusMinutes(mm);
            lt=lt.plusSeconds(ss);
            System.out.println("已经通话:"+lt);
            System.out.println("是否继续啊(y/n):");
            String yn=sc.next();
            if(yn.equals("n")) break;
        }
        System.out.println("通话结束,总时长:"+lt);
    }

}

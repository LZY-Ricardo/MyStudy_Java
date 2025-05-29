package day7;

import java.util.Scanner;

public class homework1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //test1();
        //test2();
        //test3();
        //test3();
        //test4();
        test5();
    }
    //a.编写程序将 “jdk” 全部变为大写,并输出到屏幕,
    // 截取子串”DK” 并输出到屏幕
    public static void test1(){
        String s="jdk";
        String upper=s.toUpperCase();
        System.out.println(upper);
        System.out.println(upper.substring(1,3));
    }
    //b.String s="name=zhangsan age=18 classNo=090728";
    //    将上面的字符串拆分，结果如下:
    //     zhangsan 180 90728
    public static void test2(){
        String s="name=zhangsan age=18 classNo=090728";
        String[] split=s.split(" ");
        for(String str:split){
            String[] split2=str.split("=");
            System.out.print(split2[1]+" ");
        }
    }
    //c.写一个方法判断一个字符串是否对称(对称是正反都一样的)
    public static void test3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s=sc.next();
        for (int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                System.out.println("不是对称字符串");
                return;
            }
        }
        System.out.println("是对称字符串");
    }
    //a.  给定一个长度,随机产生一个该长度的字符串,
    // 由大写,小写字母以及数字组成
    public static void test4(){
        System.out.println("请输入一个长度:");
        int length=sc.nextInt();
        String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String s="";
        for (int i=0;i<length;i++){
            int index=(int)(Math.random()*characters.length());
            s=s+characters.charAt(index);
        }
        System.out.println(s);
    }
    //b.把一个字符串的大写字母放到字符串的后面  其他字符位置不变
    //如:AkleBiCeilD   ==> kleieilABCD
    public static void test5(){
        String s="AkleBiCeilD";
        char[] Uppercase=new char[s.length()];
        char[] Lowercase=new char[s.length()];
        int j = 0;
        int k = 0;
        int z = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' ){
                Uppercase[j++]=s.charAt(i);
            }else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                Lowercase[k++]=s.charAt(i);
            }
        }
        char[] result=new char[s.length()];
        for (int i=0;i<Lowercase.length;i++){
            if(Lowercase[i]!='\0'){
                result[z++]=Lowercase[i];
            }
        }
        for(int i=0;i<Uppercase.length;i++){
            if(Uppercase[i]!='\0'){
                result[z++]=Uppercase[i];
            }
        }
        for (int i=0;i<result.length;i++)
            System.out.print(result[i]);
    }
}

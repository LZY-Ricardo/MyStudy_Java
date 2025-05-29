package day7;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        test5();
    }
    //a.编写程序将 “jdk” 全部变为大写,并
    //输出到屏幕,截取子串”DK” 并输出到屏幕
    public static void test1(){
        String s="jdk";
        s=s.toUpperCase();//再常量池新增了JDK
        System.out.println(s);
        s=s.substring(1);
        System.out.println(s);
    }
    //b.String s="name=zhangsan age=18
    // classNo=090728";
    //    将上面的字符串拆分，结果如下:
    //     zhangsan 18 090728
    public static void test2(){
        String s="name=zhangsan age=18 classNo=090728";
        //[key=value,key2=value2,...]
        String[] strs=s.split(" ");
        for(String str:strs){
            System.out.print(str.split("=")[1]+" ");
        }
    }
    //c.写一个方法判断一个字符串是否对称(对称是正反都一样的)
    public static void test3(){
//        if(isReverse("java")) System.out.println("是对称的");
//        else System.out.println("不对称");
        String s="java";
        if(s.equals(reverse(s)))System.out.println("是对称的");
        else System.out.println("不对称");
    }
    public static boolean isReverse(String s){
        String result="";
        //倒序遍历
        for(int i=s.length()-1;i>=0;i--){
            result +=s.charAt(i);
        }
        System.out.println(result+"-----");
        return s.equals(result);
    }
    //s=java  =  "a"+reverse(jav)
    //s=java  =  reverse(ava)+"j"
    public static String reverse(String s){
        //提供出口  长度==1 返回
        if(s.length()==1) return s;
        //             "ava"           + j
        return  reverse(s.substring(1))+s.charAt(0);
    }
    //a.  给定一个长度,随机产生一个该长度
    //的字符串,由大写,小写字母以及数字组成
    public static void test4(int len){
        /*ascii A-Z 65-90
              a-z 97-122
              0-9 48-57

            1-10  表示数字 +47
            11-36 表示大写字母 +54
            37-62 表示小写字母 +60
         */
        Random r=new Random();
        String  result="";
        for(int i=0;i<len;i++) {
            int n = r.nextInt(62) + 1;
            if (n <= 10) n += 47;
            else if (n <= 36) n += 54;
            else n += 60;
            result += (char) n;
        }
        System.out.println(result);
    }
    //b.把一个字符串的大写字母放到字符串的后面
    // 其他字符位置不变
    //如:AkleBiCeilD   ==> kleieilABCD
    public static void test5(){
        String s="AkleBiCeilD";
        String prefix="";
        String suffix="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90) suffix+=ch;
            else prefix+=ch;
        }
        System.out.println(prefix+""+suffix);
    }
}

package day7;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        //编码方式不同中文汉字占字节数不同
        //比如: utf-8  每个占3个字节
        //     gbk    每个占2个字节
        String s="java代码";
        //String-->byte数组
        byte[] bs=s.getBytes();
        //String-->char数组
        char[] cs=s.toCharArray();
        System.out.println(Arrays.toString(bs));
        System.out.println(Arrays.toString(cs));

        String s2="java";
        String s3=new String("jAvA");
        System.out.println(s2==s3);
        //想判断元素内容是否一致
        System.out.println(s2.equals(s3));
        //验证码: C1b9  c1b9  C1B9
        //忽略大小写 判断内容是否一致
        System.out.println(s2.equalsIgnoreCase(s3));

        //去除字符串两端空格
        String s4="  java  ";
        s4=s4.trim();//把  java  去除了两端空格 生成了新得常量java
        //注:字符串修改方法 必须重新指向
        System.out.println(s4);//java
        //trim有个bug: 只能去除半角空格 无法去除全角空格
        String s5="　　java  ";
        s5=s5.trim();
        System.out.println(s5);
        //java11 String新增了方法  去除全角和半角
        //s5=s5.strip();
        //System.out.println(s5);
    }
}

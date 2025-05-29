package day7;

import java.util.Scanner;

public class Demo4 {
    //实现敏感词替换
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入你要说的话:");
            //如果输入空格  会当成下一次输入的单词
            //String content=sc.next();
            //获取输入一行数据  可以包含空格
            String content=sc.nextLine();
            //替换敏感词
            content=replaceContent(content);
            System.out.println(content);
        }
    }
    //后期: 有一个敏感词的表  通过数据库查询给words赋值
    static String[] words={"你妈","你大爷","会不会玩","菜鸡","垃圾"};
    public static String replaceContent(String c){
       for(String w:words){
           //判断输入的字符串是否包含敏感词
           if(c.contains(w)){
               String replace="";
               for(int i=0;i<w.length();i++){
                   replace+="*";
               }
               //replace()  replaceAll()
               c=c.replaceAll(w,replace);
           }
       }
       return c;
    }
}

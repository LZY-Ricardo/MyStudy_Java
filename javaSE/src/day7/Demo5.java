package day7;

import java.util.Locale;

public class Demo5 {
    //有一个字符串内容 获取里面的每个单词 并且 每个单词
    //首字母大写 其余字母小写
    public static void main(String[] args) {
        String str="this is javascript MySql SpringMVC";
        //1.获取每个单词
        //通过指定内容 对字符串进行分组(分割)返回字符串数组
        String[] words=str.split(" ");
        for(String w:words){
            //2.获取首字母  3.获取其余字母
            String prefix=w.substring(0,1).toUpperCase();
            //charAt(下标) 获取指定下标的字符
            String prefix2=w.charAt(0)+"".toUpperCase();

            String suffix=w.substring(1).toLowerCase();
            System.out.println("结果:"+prefix+suffix);
        }
        Demo5 d1=new Demo5();
        Demo5 d2=new Demo5();
        System.out.println(d1==d2);//地址 false
        System.out.println(d1.equals(d2));//地址 false


    }
}

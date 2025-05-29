package day7;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Demo3 {
    //上传文件 不是通过上传的文件名来保存的
    //而是 文件名随机处理(UUID,时间戳,随机数)
    //后缀名 需要保留
    //需求1: 先判断上传的文件格式是否是图片格式
    //需求2: 获取上传文件的后缀名
    //需求3: 文件名随机处理
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入上传的图片");
        String name=sc.next(); //1.png   abc.abc.jpg  abc.java
        //定义一些常用的图片后缀
        String[] suffix={".png",".jpg",".gif"};
        boolean b=false;
        for(String s:suffix){
            //s.equals(name)
            //判断name字符串是否包含s内容
            //name.contains(s);
            //判断name是否已s内容作为后缀
            if(name.endsWith(s)) {
                b=true; break;
            }
        }
        //判断结果
        if(b) {
            System.out.println("是图片格式");
            //name
            //需求2:获取上传图片的后缀名  123.png  a.b.c.gif
            //.png    .gif
            //indexOf("内容"):获取指定内容首次出现的位置(下标)
            //lastIndexOf():获取指定内容最后出现的位置(下标)
            //subString(): 截取字符串(开始下标,结束下标)
            //subString(): 截取字符串(开始下标) 从指定下标开始截取到末尾
            String suf=name.substring(name.lastIndexOf("."));
            System.out.println("后缀名:"+suf);
            //需求3:文件名要随机处理(UUID 时间戳  随机数 随机多少位字母)
            //UUID: 生成32位永不重复的字符串
            String fileName=UUID.randomUUID().toString();
            //时间戳: 时间的毫秒数
            long fileName2=System.currentTimeMillis();
            //随机:  4位随机字母(小写)...
            String fileName3=randString(8);
            //新文件名=随机文件名+后缀
            String newName1=fileName+suf;
            String newName2=fileName2+suf;
            String newName3=fileName3+suf;
            System.out.println(newName1);
            System.out.println(newName2);
            System.out.println(newName3);
        }
        else System.out.println("不是图片格式");
    }
    public static String randString(int len){
        Random r=new Random();
        //后期 需要修改的 不能写String 适合写增强型字符串
        String result="";
        for(int i=0;i<len;i++) {
            //97-122
            int n = r.nextInt(26) + 97;
            result += (char) n;
        }
        return result;
    }

}

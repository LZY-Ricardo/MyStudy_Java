package day8;

import java.util.Random;

//测试增强型字符串
public class Demo {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder("java");
        System.out.println(sb);
        System.out.println(sb2);
        //2.对象调用方法 对字符串进行处理
        sb2.append("script");//追加字符串
        System.out.println(sb2);//javascript
        //3.选择题
        String str="java";
        StringBuilder sb3=new StringBuilder("java");
        String str2=sb3.toString();//转换String类型,底层new String()
        System.out.println(str.equals(sb3));//false
        System.out.println(str==sb3.toString());//false
        System.out.println(str==new String("java"));//false
        System.out.println(str.equals(sb3.toString()));//true

        //增强型常用方法  //java
        sb3.deleteCharAt(1); //jva
        System.out.println(sb3);
        sb3.delete(1, sb3.length()-1);//ja
        System.out.println(sb3);

        sb3.insert(1,"spring");//jspringa
        System.out.println(sb3);

        sb3.replace(1,sb3.length()-1,"mysql");//jmysqla
        System.out.println(sb3);

        sb3.reverse();//针对于字符串内容进行反转
        System.out.println(sb3);

        //案例:通过StringBuilder 完成随机6位字符串
        //随机得字符串只能是: # $ % & 四种构成
        char[] ch={'#','$','%','&'};
        Random r=new Random();
        StringBuilder msg=new StringBuilder();
        for(int j=0;j<6;j++) {
            int i = r.nextInt(4);
            msg.append(ch[i]);
        }
        System.out.println(msg);
        //案例2: 随机字符串长度不是固定 是根据级别来得
        //一级 随机长度是2得字符串  内容 # $
        //二级 随机长度是3得字符串  内容 # $ %
        //三级 随机长度是4得字符串  内容 # $ % &
        //...
        //六级 随机长度是7得字符出  内容 # $ % & * [ @
        char[] cs2={'#','$','%','&','*','[','@'};
        for(int level=1;level<=6;level++){ //外层for表示级别
            StringBuilder string=new StringBuilder();
            for(int len=0;len<level+1;len++) { //内层for表示长度
                int i = r.nextInt(level + 1); //随机范围跟级别有关系
                string.append(cs2[i]);
            }
            System.out.println("级别:"+level+"字符串内容:"+string);
        }

        //StringBuffer使用方式和StringBuilder使用方式一样
        StringBuffer sb4=new StringBuffer();
        sb4.reverse();
        //sb4.append()
        //sb4.insert()
    }
}

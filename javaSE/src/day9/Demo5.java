package day9;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.two 2.three");
        int n = sc.nextInt();
        One one=null;
        if(n==1){
            one=new Two();
        }else if(n==2){
            one=new Three();
        }
        if(one instanceof Two){
            Two two=(Two)one;
            System.out.println("成功转换two对象");
        }else if(one instanceof Three){
            Three three=(Three)one;
            System.out.println("成功转换three对象");
        }
    }
}
class One{ }
class Two extends One{ }
class Three extends One {}
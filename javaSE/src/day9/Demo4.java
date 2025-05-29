package day9;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4 {
    public static void main(String[] args) {
        String s=null;
        if(s!=null) {
            int len = s.length();
            System.out.println(len);
        }else {
            System.out.println("s为空");
        }
        int[] a=new int[10];
        for(int i=0;i<=a.length;i++) {
            a[i] = 100;
        }
//        Object o=null;
//        o.getClass();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //编译报错      try-catch 或 抛出来解决
        //Date d=sdf.parse("2012-10-20");
        //FileInputStream fis = new FileInputStream("");
    }
}

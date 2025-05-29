package day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Date类型
public class Demo3 {
    public static void main(String[] args) throws ParseException {
        //1.创建日期对象
        Date d=new Date();
        //Sat Mar 22 15:20:04 CST 2025  国际化时间
        System.out.println(d);
        //2.对日期类型做格式化(格式化成适合我们的格式)
        //也可以用于String <==> Date
        //日期格式的参数:y年 M月份 d天份
        // h12进制时 H24进制时   m分钟   s秒 S毫秒
        SimpleDateFormat sdf=
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss S");
        //Date===>String
        String time=sdf.format(d);
        System.out.println(time);
        //String===>Date
        String time2="2012-10-20 12:10:30 123";
        //注:字符串想转换日期 需要满足上面的日期格式
        Date d2=sdf.parse(time2);
        System.out.println(d2);

        //通过日期对象还可以获取毫秒数(从1970.1.1至今的毫秒数)
        long ms=d.getTime();
        long begin=System.currentTimeMillis();
        //调用方法 执行代码
        long end=System.currentTimeMillis();
        System.out.println(ms);
        System.out.println(begin);


        //4.java.sql.Date <==> java.util.Date
        //util==>sql
        Date d3=new Date();
        //包名.包名.类名 表示全类名就是类的完整路径
        java.sql.Date sqlDate=new java.sql.Date(d3.getTime());
        //sql==>util 和上面类似
        Date d4=new Date(sqlDate.getTime());
    }
}

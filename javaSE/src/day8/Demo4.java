package day8;

import java.util.Calendar;
import java.util.Date;

//Calender日历对象
public class Demo4 {
    public static void main(String[] args) {
        //1.实例化日历对象
        Calendar c=Calendar.getInstance();

        //2.设置时间
        c.setTime(new Date());//当前时间

        //3.通过日历的常量获取日期指定的内容
        //c.get(Calendar.常量);
        int day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);//22
        //外国人 周日是每周开始 表示1  周六是结束表示7
        int week=c.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);//7

        //4.做一些简单日期运算
        //c.add(Calendar.常量,数值);
        c.add(Calendar.DAY_OF_YEAR,10);//添加10天
        System.out.println(c.getTime());
        c.add(Calendar.WEEK_OF_YEAR,1);//添加一周
        System.out.println(c.getTime());
    }
}

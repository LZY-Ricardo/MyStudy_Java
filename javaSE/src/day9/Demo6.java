package day9;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//抛出异常
public class Demo6 {
    public static void main(String[] args)throws ParseException{ //上一级
        new Demo6().test();
    }
    public void test() throws ParseException{ //上一级
        play();
    }
    //在方法声明上添加throws 来抛出异常 抛给上一级
    public void play() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.parse("fasf");
    }
}

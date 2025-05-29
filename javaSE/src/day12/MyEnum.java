package day12;

import java.time.DayOfWeek;
import java.time.LocalDate;

//枚举测试类
public enum MyEnum {
    //枚举提供的三个常量 最后也只会调用三次构造方法
    ONE,TWO,THREE;
    //枚举构造必须私有
    private MyEnum(){}
    String name;//成员变量
    public void test(){}

    public static void main(String[] args) {
        MyEnum m1=MyEnum.ONE;
        MyEnum m2=MyEnum.TWO;
        MyEnum m3=MyEnum.THREE;
    }
}
enum MyEnum2{
    //AAA调用有参构造 BBB默认调用无参构造
    //但是最终 只会调用两次构造
    AAA(10,"java"),BBB;
    private MyEnum2(){
        System.out.println("调用无参构造");
    }
    private MyEnum2(int a,String b){
        System.out.println("调用有参构造");
    }

    public static void main(String[] args) {
        MyEnum2 m1=MyEnum2.AAA;
        MyEnum2 m2=MyEnum2.AAA;
        MyEnum2 m3=MyEnum2.BBB;
        MyEnum2 m4=MyEnum2.BBB;

        //枚举还支持Switch
//        switch (m4){
//            case AAA:;
//            case BBB:;
//        }

        LocalDate ld=LocalDate.now();
        DayOfWeek dw=ld.getDayOfWeek();
        switch (dw){
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
            case SATURDAY:
                System.out.println("星期六");
                break;
            case SUNDAY:
                System.out.println("星期日");
                break;
        }
    }
}

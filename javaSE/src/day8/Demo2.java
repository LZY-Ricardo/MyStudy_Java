package day8;

import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        //基本类型封装类型(属于类的类型) 让基本类型具有类的特征
        Byte b=10;
        Byte b3=new Byte((byte)10);
        byte b2=10;

        Short s=10;
        Integer i=10;
        Long l=10l;
        long l2=1234; //长度没有超过int   long=int;
        long l3=12345678901l;//长度超过了int  需要添加l表示long类型


        Float f=10f;
        Float f2=15.5f;
        float f3=10;
        float f4=15.5f;

        Double d1=10D;
        Double d2=15.5; //Double==double 属于装箱
        Double d3=15.5D;

        char ch='A';
        Character ch2='B';

        boolean boo1=true;
        Boolean boo2=false;
        //面试题1: 基本类型和封装类型区别是什么?
        //面试题2: int和Integer的区别是什么?
        //是同一道题
        //答案: 基本类型比如:int  默认值 0 ,没有类的特征 ,所以就不能
        //     通过对象调用属性和方法
        //     封装类型比如:Integer 默认值 null,
        //     是java为了让基本类型具有类的特征(静态特征(属性),动态特征(方法))
        //     就可以通过这些提供好的属性和方法 对数据进行处理 或者类型转换
        //     后期使用泛型的时候 只能是封装类型不能是基本类型
        //List<int> list;
        //List<Integer> list2;

        int num1=10;
        //这三者是等价的
        Integer num4=num1;
        Integer num2=Integer.valueOf(num1);
        Integer num3=new Integer(num1);

        Integer n=new Integer(100);
        //这两者是等价的
        int n2=n;
        int n3=n.intValue();

        Integer number=127;  //IntegerCache.cache[下标]=127//装箱 底层Integer.valueof(150)
        Integer number2=127; //IntegerCache.cache[下标]=127
        System.out.println(number==number2);//false

    }
}

package day5;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.function.Predicate;

//函数式接口
@FunctionalInterface
public interface MyFunction {
    public void test();
    //void test2();
}
interface MyFunction2{
    public int getNum(int a,int b);
    String name="java";
    public default void test(){
        //Consumer
        //Predicate
        //Comparator
    }
}
interface MyFunction3{
    public void test(int a);
}
//函数式接口应用场景：使用于给lambda表达式使用
class TestLambda{
    public static void main(String[] args) {
        MyFunction my=new MyFunction(){
            public void test(){
                System.out.println("测试1代码");
            }
        };
        //利用lambda表达式 也可以实现上面的过程
        MyFunction my2=()->{
            System.out.println("测试2代码");
        };
        my.test();
        my2.test();
        MyFunction2 my3=(int a,int b)->{
            System.out.println(a+" "+b);
            return a+b;
        };
        //可以省略形参类型
        MyFunction2 my4=(a,b)->{
            return 10;
        };
        //一个参数 还可以继续省略()
        MyFunction3 my5= a ->{
        };

        //如果 方法的实现只有一句话  也可以省略{}
        MyFunction3 my6=a-> System.out.println(a);
        //如果 方法实现 有返回值 并且 只有一句话
        // {}和return都可以省略
        MyFunction2 my7=(a,b)->a+b;
        int result=my3.getNum(10,20);
        System.out.println(result);
    }
}
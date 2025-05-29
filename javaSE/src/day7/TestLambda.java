package day7;

import java.util.Comparator;

//测试lambda表达式:描述函数式接口的
public class TestLambda {
    public static void main(String[] args) {
        //匿名内部类来实现接口的
        F1 f1=new F1(){
            String name;
            public int num(int a, int b) {
                return 0;
            }
        };
        //lambda表达式 可以替换上面的匿名内部类的编写方式
        F1 f2=(int a,int b) -> {
            return a+b;
        };
        int c=f2.num(10,20);
        System.out.println(c);

        //lambda表达式语法1: 方法参数类型是可以省略的
        F1 f3=(a, b) -> {
            return a+b;
        };
        //lambda表达式语法2: 方法参数如果有一个 类型和()都
        //可以省略
        F2 f4=a->{
            return 0;
        };
        //lambda表达式语法3: 方法实现部分 如果只有一行代码
        //这行代码正好是方法的返回值 那么{} 和 return 都可以
        //省略
        F1 f5=(a,b)-> a+b;
        int result=f5.num(100,200);
        System.out.println(result);
        Comparator<String> com= (o1,o2)-> o1.compareTo(o2);
        Runnable run=()->{

        };
        //vue发送编写函数  也可以具有这种箭头函数
        //const test = ()=>{
        //};

    }
}
//函数式接口:一个抽象方法
@FunctionalInterface
interface F1{
    int num(int a,int b);
    public default void a(){}
    public default void b(){}
    public static void c(){}
}
@FunctionalInterface
interface F2{
    int num(int a);
    public default void a(){}
    public default void b(){}
    public static void c(){}
}

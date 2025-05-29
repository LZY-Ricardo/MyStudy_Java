package day4;
//代码块
public class Demo3 {
    {
        System.out.println("构造代码块,new对象的时候执行");
    }
    public Demo3(){
        System.out.println("构造方法");
    }
    public void test(){
        {
            System.out.println("普通代码块,方法调用时候执行");
        }
    }
    //static String name;
    static{
        //System.out.println(name);
        //test();
        System.out.println("静态代码块,类加载才执行，而且执行一次");
    }
    public static void main(String[] args) {
        Demo3 d1=new Demo3();
        Demo3 d2=new Demo3();
        d1.test();
        d1.test();
        d2.test();
    }
}
class TestDemo3{
    public static void main(String[] args) {

    }
}
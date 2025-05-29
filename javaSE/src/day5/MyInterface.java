package day5;
//测试接口：关键字interface
public interface MyInterface {
    //特点1：接口的所有属性都是常量
    // (默认修饰符 public static final)
    public static final String name="aa";
    String sex="男";
    //特点2：接口没有构造方法
    //public MyInterface(){}
    //特点3：接口的方法都是抽象方法 不能有普通方法
    //默认修饰符 abstract
    public abstract void test();
    void test2();
    //public void test3(){}
    //特点4：接口和接口 支持多继承
    //      类和类     单继承
    //      类和接口   表示实现 支持多实现
    //特点5：不能实例化
    //特点6：jdk1.8 接口支持静态方法和默认方法
    public static void method(){

    }
    //接口表示这种方法不强制要求你需要重写
    public default void method2(){

    }
}
interface MyInterface1 extends MyInterface2,MyInterface3 {
    void test1();
}
interface MyInterface2 {
    void test2();
}
interface MyInterface3 {
    void test3();
}
class My implements MyInterface3, MyInterface2 {
    public void test3() {

    }
    public void test2() {

    }
}
class My2 implements MyInterface1 {
    public void test1() {

    }
    public void test2() {

    }
    public void test3() {

    }
}

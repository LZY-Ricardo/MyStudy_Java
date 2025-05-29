package day5;
//java中的类 如果有抽象方法,那么这个类也是抽象类
public abstract class Demo {
    //成员变量
    String str;
    //构造方法
    public Demo(){}
    //静态变量
    static int num;
    //静态方法
    public static void print(){}
    //普通方法
    public void test(){

    }
    //抽象方法abstract修饰
    public abstract void test2();

    public static void main(String[] args) {
        //抽象类不能被实例化,原因在于抽象类可能存在
        //抽象方法,在于声明没有实现(没有洗完)
        Demo d=new Demo(){
            public void test2(){

            }
        };
    }
}
//子类继承父类时抽象类 必须强制实现里面的抽象方法
//如果没有重写    那么子类也是抽象类
class Demo2 extends Demo{
    public void test2(){

    }
}
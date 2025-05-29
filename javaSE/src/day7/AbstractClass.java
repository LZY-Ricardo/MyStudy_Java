package day7;
//测试抽象类和普通类区别
public abstract class AbstractClass{
    //抽象类可以有普通属性
    String a;
    private int b;
    //抽象类可以有普通方法
    public void method(){
    }
    public static void method2(){
    }
    //抽象类可以有可以没有抽象方法
    //但是有抽象方法的类 必须是抽象类
    public abstract  void method3();
    //抽象类可以有构造方法
    public AbstractClass(){

    }
    public static void main(String[] args) {
        //抽象类不能被实例化
        //AbstractClass ac=new AbstractClass();
    }
}

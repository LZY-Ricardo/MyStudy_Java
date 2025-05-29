package day5;
//父类静态代码块 父类构造方法 父类构造代码块 子类静态代码块 子类构造方法 子类构造代码块 他们的执行顺序是什么？
public class First {
    static {
        System.out.println("父类静态代码块");
    }
    public First(){
        System.out.println("父类构造方法");
    }
    {
        System.out.println("父类构造代码块");
    }
}
class Second extends First {
    static {
        System.out.println("子类静态代码块");
    }
    public Second(){
        System.out.println("子类构造方法");
    }
    {
        System.out.println("子类构造代码块");
    }

    public static void main(String[] args) {
        //直接创建子类对象
        //加载类 父类 子类
        //父类对象(构造代码块 构造方法)
        //子类对象(构造代码块 构造方法)
        new Second();
    }
}
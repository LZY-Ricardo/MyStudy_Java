package day12;
//饿汉式实现
//1.构造私有化
//2.提供一个方法 怎么调用都返回一个对象
public class MySingleton1 {
    //饿汉式:需要my对象 无论你是否需要使用 都先创建出来
    private static MySingleton1 my=new MySingleton1();
    private MySingleton1(){};
    public static MySingleton1 get(){
        return my;
    }
}
class Test{
    public static void main(String[] args) {
        MySingleton1 m1=MySingleton1.get();
        MySingleton1 m2=MySingleton1.get();
        MySingleton1 m3=MySingleton1.get();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}

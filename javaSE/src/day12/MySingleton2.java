package day12;
//懒汉式:当对象比较大的时候,如果你要创建对象式很花资源的
//懒汉式就可以在你真正使用的时候才开始创建 提高性能
//1.构造私有化
//2.提供一个方法 返回一个对象(第一次使用才创建)
public class MySingleton2 {
    private static MySingleton2 my;
    private MySingleton2(){}
    //缺点:存在多人使用并发隐患,并发量比较高的时候 很可能
    //多个线程同时进入if 这样就会造成创建多个对象 违反了单例模式
    //解决方法:添加synchronized同步锁 来限制 进入方法 的线程数
    //这样的话 只有一个线程可以进入方法 它结束了 下一个线程才能进来
    public static synchronized MySingleton2 get(){
        if(my==null) my=new MySingleton2();
        return my;
    }
}

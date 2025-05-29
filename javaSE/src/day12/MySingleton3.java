package day12;
//双重检锁实现:懒汉式有一个缺点 在多线程情况下 执行效率非常低
//那么双重检锁 不仅可以实现 延迟加载的功能(懒加载) 而且也可以保证 线程安全
//属于一种比较高效 线程安全处理方式,因为它可以降低锁的颗粒度(原来懒汉式锁的是一个方法 它锁的是方法种的一小部分代码)
//1.私有构造
//2.对外提供一个方法返回一个对象(第一次才创建)
public class MySingleton3 {
    private static MySingleton3 my;
    private MySingleton3(){}
    public static MySingleton3 get(){
        if(my==null){
            synchronized (MySingleton3.class){
                if(my==null) my=new MySingleton3();
            }
        }
        return my;
    }
}

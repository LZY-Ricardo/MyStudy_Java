package day12;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//静态内部类实现:如果你需要延迟加载对象 同时还要保证一个高效的线程安全
//可以采用静态内部类来实现,因为类加载 本身就是线程安全的
//无论多少个线程只会加载一次 会比传统的线程安全 更加优雅
//1.私有构造
//2.提供一个方法返回对象(是通过静态内部类返回的)
//3.提供静态内部类(创建一次对象)
public class MySingleton4 {
    private MySingleton4(){}
    //静态内部类:首先第一次访问这个内部类,才会做类加载,也才会里面的my对象创建出来
    //所以也具有延迟加载的功能 同时类加载的过程本事就是安全的 无论多少个线程 都只做一次加载
    //所以你不用自己去处理线程安全的问题
    private static class MyHandler{
        private static final MySingleton4 my=new MySingleton4();
    }
    public static MySingleton4 get(){
        return MyHandler.my;
    }
}
class test4{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        MySingleton4 m1=MySingleton4.get();
        MySingleton4 m2=MySingleton4.get();
        System.out.println(m1);
        System.out.println(m2);
        //反射:底层调用无参构造 来创建对象
        Class c=MySingleton4.class;
        Constructor con=c.getDeclaredConstructor();
        con.setAccessible(true);
        MySingleton4 m3=(MySingleton4) con.newInstance();
        System.out.println(m3);
        //所以传统的单例模式:基本都可以通过反射创建一个额外的对象
        //但是枚举 就可以强制控制 调用构造方法的次数
    }
}
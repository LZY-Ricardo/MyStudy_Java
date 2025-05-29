package day10;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//测试junit
public class TestJunit {
    public static void main(String[] args) {

        System.out.println("运行main()");
        //获取当前线程 属于线程类的静态方法
        String name=Thread.currentThread().getName();
        System.out.println("当前线程:"+name);//main主线程
    }
    //测试方法:访问修饰符 一般要求public
    //返回值: 一般都是void
    //方法的参数: 一般是无参
    @Test
    public void c(){
        String name=Thread.currentThread().getName();
        System.out.println("当前线程:"+name);//main主线程
    }
    @Test
    public void a(){
        System.out.println("运行a()");
        String name=Thread.currentThread().getName();
        System.out.println("当前线程:"+name);//main主线程
    }
    @Test
    public void b(){
        String name=Thread.currentThread().getName();
        System.out.println("当前线程:"+name);//main主线程
    }
    @Before
    public void before(){
        System.out.println("运行before(),用于在测试方法之前执行,一般可以属性做一些初始化");
    }
    @After
    public void after(){
        System.out.println("运行after(),用于在测试方法之后执行,一般可以属性做一些释放资源");
    }
}

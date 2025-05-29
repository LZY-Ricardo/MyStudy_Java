package day9;

import java.util.ArrayList;
import java.util.List;

//测试内存溢出
public class Demo3 {
    public static void main(String[] args) {
        test2();
    }
    //1.出现堆内存溢出错误代码
    //堆内存:主要存放创建的实例(new 对象 数组 集合...)
    //OutOfMemoryError
    public static void test1(){
        //集合相对数组 长度会实现自动扩容
        List list=new ArrayList();
        while(true){
            new Object();
            list.add(new Object());
            System.out.println(list.size());
        }
    }
    //2.出现栈内存溢出错误代码
    //栈内存:主要存放栈,每个栈帧表示每个java方法运行过程
    //StackOverflowError
    public static void test2(){
        test2();//通过递归 无限调用自己 不用提供出口
    }
}

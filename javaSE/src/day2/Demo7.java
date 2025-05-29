package day2;

import java.util.Arrays;
import java.util.Comparator;

//数组工具类排序Arrays
public class Demo7 {
    public static void main(String[] args) {
        //Integer属于int封装类
        Integer n=10;
        int n2=10;
        Integer[] nums={1,7,9,2,3,6,7,1,-6};
        System.out.println("排序前:"+Arrays.toString(nums));
        Arrays.sort(nums); //默认升序排列
        System.out.println("排序后:"+Arrays.toString(nums));
        //如果想降序排列 需要添加一个额外参数 比较器对象
        //比较器对象: 主要是有两种  Comparable内部比较器
        //Compartor 外部比较器: 是一个函数式接口 内存有一个
        //抽象方法compare() 控制排序结构  通过返回值int
        //>0  =0  <0 控制谁大谁小的
        //匿名内部类方式实例化接口的  比较繁琐
//        Comparator<Integer> c=new Comparator<Integer>(){
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        };
        //Lambda表达式 jdk1.8特性 用于描述函数式接口的
        Comparator<Integer> c2=(o1,o2)-> o2-o1;
        Arrays.sort(nums,c2);
        System.out.println("排序后2:"+Arrays.toString(nums));

    }
}
class Demo10{ //普通类
    public void test(){}
}
interface Abc{  //普通接口
    public void test1();
    public void test2();
    public void test3();
}
@FunctionalInterface
interface Bcd{  //函数式接口
    public void test1();
}
package day5;

import java.util.Arrays;

public class TestSortLambda {
    public static void main(String[] args) {
        //借助于Arrays.sort() 来实现我的函数式接口
        //要求 参数和返回值一致
        MySort my=Arrays::sort;
        int[] nums={3,1,8,7,2};
        my.mySort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
interface MySort {
    public void mySort(int[] a);
}
class MyTest{
    public static String concat(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        MyString my=MyTest::concat;
        String result=my.XXX("java","script");
        System.out.println(result);
    }
}
interface MyString{
    String XXX(String a, String b);
}
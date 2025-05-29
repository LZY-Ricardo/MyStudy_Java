package day2;

import java.util.Arrays;

//数组使用
public class Demo6 {
    public static void main(String[] args) {
        //如果没有赋值  数组的元素都有默认值
        //整型(byte short int long)默认值都是0
        int[] scores=new int[5];
        //char 默认值是''
        char[] chs=new char[3];
        //boolean 默认值是false
        boolean[] bs=new boolean[3];
        //float double 默认值 0.0
        double[] ds=new double[3];
        //String 和 其他引用类型都是一样 默认值null
        String[] strs=new String[3];
        //下标0--4  否则会越界
        System.out.println(scores[0]);
        System.out.println(scores[4]);
        System.out.println(chs[0]);
        System.out.println(bs[2]);
        System.out.println(ds[2]);
        System.out.println(strs[0]);
        System.out.println(Arrays.toString(strs));
        strs[2]="aaa";
        System.out.println(Arrays.toString(strs));
        System.out.println("标准for循环遍历");
        for(int i=0;i<strs.length;i++){
            System.out.println( strs[i] );
        }
        System.out.println("增强for循环遍历");
        //语法结构:
        //数据类型:表示数组里面元素的类型
        //临时别名:每次循环遍历出来数组元素
        //底层原理:通过迭代器实现的
        // for(数据类型 临时别名:数组或者集合){
        // }
        double[] cards={1000,2000,500.50,1500};
        for(double d:cards){
            System.out.println(d);
        }
    }
}

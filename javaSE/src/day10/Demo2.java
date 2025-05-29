package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//实现自动扩容的数组:默认长度10 当存储11个元素时候 扩容1.5倍
public class Demo2 {
    List list=new ArrayList<>();
    int[] nums=new int[10];
    int index=0;//用于保存 目前存储到的元素下标
    public void add(int n){
        list.add(10);
        list.add("aaa");
        //判断是否达到最大长度 否则扩容
        if(nums.length==index) expa();
        nums[index++]=n;
    }
    public void expa(){ //扩容1.5倍
        int newLen=(int)(nums.length*1.5);
        nums= Arrays.copyOf(nums,newLen);
        System.out.println("扩容成功,新的长度:"+nums.length);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Demo2 d=new Demo2();
        while(true){
            int n=sc.nextInt();
            d.add(n);
        }
    }
}

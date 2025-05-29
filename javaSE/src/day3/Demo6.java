package day3;

import java.util.Arrays;
import java.util.Scanner;

//在一个有序数组上 手动输入一个元素 插入到数组中
//并且保证数组的顺序
public class Demo6 {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50,60};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要插入的元素:");
        int n=sc.nextInt();//15
        //定义长度多1的数组
        int[] newNums=new int[nums.length+1];
        //将原来的数组存入到新数组中
        //10,20,30,40,50,60,0
        for(int i=0;i<nums.length;i++){
            newNums[i]=nums[i];
        }
        //计算插入的元素下标
        int index=newNums.length-1;
        for(int i=0;i<nums.length;i++){
            //超出第一个比插入元素大的下标
            if(n<nums[i]){
                index=i;
                break;
            }
        }

        //对数组的元素进行元素后移
        for(int i=newNums.length-1;i>index;i-- ){
            newNums[i]=newNums[i-1];
        }
        //10 20 30 40 50 60
        //插入元素
        //10 15 20 30 40 50 60
        newNums[index]=n;
        System.out.println("插入前:"+Arrays.toString(nums));
        System.out.println("插入后:"+Arrays.toString(newNums));
    }
}

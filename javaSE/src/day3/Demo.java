package day3;

import java.util.Arrays;

//选择排序
public class Demo {
    public static void main(String[] args) {
        int[] nums={3,7,4,1,-10};
        System.out.println("排序前:"+Arrays.toString(nums));
        //外层循环 可以控制比较轮数
        for(int i=0;i<nums.length-1;i++){
            int index=i;    //记录最开始的下标
            //内层循环  控制每轮比较次数 区别在于
            //初始值不是从0开始 都是一直比较到结束
            for(int j=i+1;j<nums.length;j++){
                if(nums[index]>nums[j]){
                    index=j;//记录更小值
                }
            }
            //经过内存循环    找到最小值时index的下标
            if(index!=i){
                nums[i]=nums[i]^nums[index];
                nums[index]=nums[i]^nums[index];
                nums[i]=nums[i]^nums[index];
            }
        }
        System.out.println("排序后:"+Arrays.toString(nums));
    }
}

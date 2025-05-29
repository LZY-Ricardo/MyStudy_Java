package day3;
//插入排序
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args){
        int[] nums={3,10,6,7,11};
        System.out.println("排序前:"+ Arrays.toString(nums));
        //外层循环 控制比较轮数   和长度有关系
        for(int i=0;i<nums.length-1;i++){
            //内层 控制每轮比较次数：倒叙比较 for循环做减法
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    nums[j]=nums[j]^nums[j-1];
                    nums[j-1]=nums[j]^nums[j-1];
                    nums[j]=nums[j]^nums[j-1];
                }
            }
        }
        System.out.println("排序后:"+Arrays.toString(nums));
    }
}

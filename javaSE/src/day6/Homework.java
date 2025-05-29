package day6;

import java.util.HashMap;
import java.util.Map;

//a.给定一个整数数组nums，编写一个程序，
// 统计数组中每个数字出现的次数，并将结果输出
public class Homework {
    public static void main(String[] args) {
        int[] nums={3,2,2,1,4,2,3,1,5,7};
        test1(nums);
        test2(nums);
    }
    //不用集合 不用排序 只使用数组 如何实现
    //比较难
    public static void test1(int[] nums){
        //用于标记 数组的元素是否 统计过
        boolean[] b=new boolean[nums.length];
        //再创建两个数组
        int[] values=new int[nums.length];
        int[] counts=new int[nums.length];
        //遍历数组 统计每次数组元素的次数
        int index=0;//记录有几个不同元素的下标
        for(int i=0;i<nums.length;i++){
            if(!b[i]){//如果没有统计才需要进入if
                int count=1;//初始化标记次数
                b[i]=true;//标记当前元i素已经统计过
                for(int j=i+1;j < nums.length;j++){
                    if(nums[i]==nums[j]){//发现一样的了
                        count++;//次数+1
                        b[j]=true;
                    }
                }
                //最后当前i元素统计完了 记录次数
                values[index]=nums[i];
                counts[index]=count;
                index++;
            }
        }
        for(int i=0;i<index;i++){
            System.out.println("元素:"+values[i]+" 次数:"+counts[i]);
        }
    }
    //如果使用集合Map集合基于key(唯一)-value(可以重复的)如何实现
    public static void test2(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //判断key是否存在
            if(map.containsKey(nums[i])){//说明之前统计过 记录+1
                //获取原来的值+1 重新赋值
                map.put(nums[i],map.get(nums[i])+1);
            }else{//如果不存在这个key  说明这个数字是第一次 记录1
                map.put(nums[i],1);
            }
        }
        //数据遍历
        map.forEach((k, v)-> System.out.println("元素:"+k+" 次数:"+v) );
    }
}

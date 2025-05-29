package day6;
//练习: 自定义数组 求出数组中第二大的元素?  不能排序
//可以先求最大值
public class Demo2 {
    public static void main(String[] args) {
        int[] nums={3,7,11,4,-1,-9,100,100};
        //初始 由于不知道谁是最大的 假设第一个值
        int one=nums[0];
        //one一定比two大   可以赋值为int的最小值
        int two=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            //如果发现更大的了 更新max的值
            if(one<nums[i]) {
                two=one;  //把之前最大值 给第二大的值
                one=nums[i];
            }else if(two<nums[i]){//比one小 比two大
                two=nums[i];
            }
        }
        System.out.println(one+" "+two);
    }
}

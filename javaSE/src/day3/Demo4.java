package day3;

import java.util.Arrays;

//快速排序
public class Demo4 {
    public static void main(String[] args) {
        int[] nums = {11, 7, 3, 3, 20, 13, -1, -1};
        System.out.println("排序前:" + Arrays.toString(nums));
        //快速排序
        quickSort(nums, 0, nums.length - 1);
        System.out.println("排序后:" + Arrays.toString(nums));
    }

    public static void quickSort(int[] nums, int begin, int end) {
        if (begin < end) {
            //1.找出基准数正确下标
            int index = getIndex(nums, begin, end);
            //2.针对于前半部分递归
            quickSort(nums, begin, index - 1);
            //3.针对于后半部分递归
            quickSort(nums, index + 1, end);
        }
    }
    public static int getIndex(int[] nums, int begin, int end) {
        //1.定义基准数 假设第一个元素是基准数
        int temp = nums[begin];
        while (begin < end) {
            //2.从后往前    根据基准数和end下标的元素比较
            //2.1 如果end的元素 比基准数大 end--;
            while (begin < end && temp <= nums[end]) {
                end--;
            }
            //2.2 如果end的元素 比基准数小 end的值 赋值begin
            nums[begin] = nums[end];
            //3.再从前往后 根据基准数和begin下标的元素比较
            //3.1 如果begin的元素 比基准数小 begin++；
            while (begin < end && temp >= nums[begin]) {
                begin++;
            }
            //3.2 如果begin的元素 比基准数大 begin的值 赋值给end
            nums[end] = nums[begin];
        }
        //4.当跳出了循环了 说明begin和end一定相等了
        //这个下标就是基准数下标
        //给基准数下标 赋值 基准数
        nums[begin] = temp;
        return begin;
    }
}

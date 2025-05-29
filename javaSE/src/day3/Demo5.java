package day3;
//二分查找
public class Demo5 {
    public static void main(String[] args) {
        int[] nums={10,20,30,30,40,50,60,70};
        //定义要查询的变量
        int number=50;
        //二分查找
        int result=binarySearch(nums,number);
        System.out.println(result);
    }
    public static int binarySearch(int[] nums,int number){
        int min=0;
        int max=nums.length-1;
        while (min<=max){
            int mid=(max+min)/2;
            if(number>nums[mid]){
                min=mid+1;
            }else if(number<nums[mid]){
                max=mid-1;
            }else{
                return mid;
            }
        }
        return -1;//如果没有找到返回-1
    }
}

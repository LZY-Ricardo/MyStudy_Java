package day2;

import java.util.Arrays;

//冒泡排序
public class Demo8 {
    public static void main(String[] args) {
        int[] nums={-10,5,-7,5,8};
        System.out.println("排序前:"+ Arrays.toString(nums));
        //外层循环  控制比较轮数(数组长度-1)
        for(int i=0;i<nums.length-1;i++){
            //内层循环  控制每轮比较次数(跟外层第i轮有关系)
            for(int j=0;j<nums.length-1-i;j++){
                //大于和小于 都可以 看你求升序还是降序了
                if(nums[j] < nums[j+1]){
                    //nums[j] <==>  nums[j+1]
                    nums[j]=nums[j]^nums[j+1];
                    nums[j+1]=nums[j]^nums[j+1];
                    nums[j]=nums[j]^nums[j+1];
                }
            }
        }
        System.out.println("排序后:"+ Arrays.toString(nums));
        //test();
    }
    //两个变量 a,b  进行两值互换 --- 面试值
    public static void test(){
        int a=10;
        int b=20;
        //1.定义临时变量  ---
        //2.利用加减法   +--
        //a=a+b;  //30
        //b=a-b;  //10
        //a=a-b;  //20
        //3.利用乘除法   *//
        //a=a*b;  //200
        //b=a/b;  //10
        //a=a/b;  //20
        //4.利用异或算法  --- 个人推荐
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+"  "+b);
        //异或就是将数据转换成二进制 01010语言 进行异或运算  相同为0 不同的为1
        //比如:3^2=1
        //0000 0011==3
        //0000 0010==2
        //-----------
        //0000 0001==1

    }
}


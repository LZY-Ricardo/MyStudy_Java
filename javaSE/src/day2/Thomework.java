package day2;

import java.util.Arrays;
import java.util.Random;

public class Thomework {
    public static void main(String[] args) {
        h5();
    }
    /**
     * a.自定义一个整形数组，
     * 求出数组元素的奇数和，偶数和，最大值和最小值
     */
    public static void h1() {
        int[] nums={10,5,7,1,2};
        int min=nums[0];
        int max=nums[0];
        int evev=0;
        int odd=0;
        for(int i:nums){
            if(min>i) min=i;
            if(max<i) max=i;
            if(i%2==0) evev+=i;
            else odd+=i;
        }
        System.out.println(evev);
        System.out.println(odd);
        System.out.println(min);
        System.out.println(max);
    }
    /**
     * b.自定义一个长度为10的整形数组，
     * 将数组最大值保存在数组第1位(提示最大值和第一位互换)
     */
    public static void h2() {
        int[] nums={10,5,7,1,23,6,10,9,6,-1};
        int max=nums[0];//最大值初始值
        int index=0;//最大值的小标
        for(int i=0; i <nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
//        index下标的元素 和 0 下标的元素进行两值互换
//        int a=10;
//        int b=20;
//        int temp=a;
//        a=b;
//        b=temp;
        if(index!=0) {
            int temp = nums[index];
            nums[index] = max;
            nums[0] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
    /**
     * c.向一个长度为5的整型数组中随机生成5个1-10的随机整数,
     * 要求生成的数字中没有重复数
     */
    public static void h3() {
        //java中定义随机数
        //1.Math.round() 生成0-1随机浮点数 包括0 不包括1
        //Math.ceil(9.1)==10 向上取整   往大了取值
        //Math.floor(9.9)==10 向下取整   往下了取值
        //四位随机整数 模拟手机验证码 1000-9999
//        for (int i=0;i<100;i++){
//            int num=(int)Math.floor(Math.random()*9000+1000);
//            System.out.println(num);
//        }
        //2.Random对象 封装了随机数的方法  比如:nextInt(范围)
//        Random r = new Random();
//        for(;;){
//            int num=r.nextInt(9000)+1000;
//            System.out.println(num);
//        }
        Random r = new Random();
        int[] nums=new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=r.nextInt(10)+1;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    /**
     * a.定义一个数组{2,3,4,5,2,3,4,2,2,2,2},
     * 求数组中出现次数超过一半的元素
     */
    public static void h4() {
        //简单处理  可以对数组的元素进行排序    数组中间的值 一定是超过一半的
        //Arrays.sort(nums);
        //nums[nums.length/2];

        int[] nums={2,3,4,5,2,3,4,2,2,2,2};
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
            }
            if(count > nums.length/2){
                System.out.println(i+"超过了一半");
                break;
            }
        }
    }

    /**
     * b.生成一个长度为5字符串数组,要求数组元素内容通过26个字母随机生成4位实现
     */
    public static void h5() {
        //随机生成26个字母(大写 小写)
        //通过Ascii码 97-122小写a-z  65-90大写A-Z  48-57数字0-9
        Random r = new Random();
        String[] str=new String[5];
        for (int j=0;j<str.length;j++){
            String s="";
            for(int i=0;i<4;i++){
                int n = r.nextInt(26) + 97;
                s+=(char)n;
            }
            str[j]=s;
        }
        System.out.println(Arrays.toString(str));
    }

    /**
     * c.自定义数组,统计数组元素第二大的元素---面试题
     */
    public static void h6() {
        int[] nums={1,3,4,5,7,2};
        int one=nums[0];
        int two=Integer.MIN_VALUE;//定义int类型最小值 保证one>two
        for(int i=0;i<nums.length;i++){
            if(nums[i]>one){//如果发现比最大值还大
                two=one;//将原来的最大值 赋值给第二大的值
                one=nums[i];//再新的最大值 赋值给one
            }else if(nums[i]>two){//比one小 比two大
                two=nums[i];
            }
        }
        System.out.println(one+"-----"+two);
    }

}

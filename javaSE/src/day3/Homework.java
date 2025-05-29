package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        h5();
    }

    /**
     * a.定义一个二维数组
     *    int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
     *    求数组中的所有元素总和
     */
    public static void h1(){
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        int result=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                result+=nums[i][j];
            }
        }
        System.out.println("数组中的所有元素总和为: "+result);
    }

    /**
     * b. 有一段乱序的字符  'a','c','u','b','e','p','f','z',
     * 请按照英文字母表的顺序升序排列
     */
    public static void h2(){
        char[] chars={'a','c','u','b','e','p','f','z'};
        System.out.println("排序前:"+Arrays.toString(chars));
        for(int i=0;i<chars.length-1;i++){
            for (int j=0;j<chars.length-1-i;j++){
                if(chars[j]>chars[j+1]){
                    chars[j]= (char) (chars[j]^chars[j+1]);
                    chars[j+1]= (char) (chars[j]^chars[j+1]);
                    chars[j]= (char) (chars[j]^chars[j+1]);
                }
            }
        }
        System.out.println("排序后:"+Arrays.toString(chars));
    }

    /**
     * c. 根据上一道题继续完成,手动输入一个字符插入的到排序后的列表中去
     *    插入后也要满足升序的顺序
     */
    public static void h3(){
        char[] chars={'a','c','u','b','e','p','f','z'};
        System.out.println("排序前:"+Arrays.toString(chars));
        for(int i=0;i<chars.length-1;i++){
            for (int j=0;j<chars.length-1-i;j++){
                if(chars[j]>chars[j+1]){
                    chars[j]= (char) (chars[j]^chars[j+1]);
                    chars[j+1]= (char) (chars[j]^chars[j+1]);
                    chars[j]= (char) (chars[j]^chars[j+1]);
                }
            }
        }
        System.out.println("排序后:"+Arrays.toString(chars));
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要插入的字符：");
        char ch=sc.next().charAt(0);
        char[] newChars=new char[chars.length+1];
        int index=newChars.length-1;
        for(int i=0;i<chars.length;i++){
            if(chars[i]>ch){
                index=i;
                break;
            }
            newChars[i]=chars[i];
        }
        newChars[index]=ch;
        for(int i=newChars.length-1;i>index;i--){
            newChars[i]=chars[i-1];
        }
        System.out.println("插入字符后:"+Arrays.toString(newChars));
    }

    /**
     * a.通过编程实现一个长度都是4的二维数组,
     * 数组的第一个值是1, 其他值无论是横排 还是纵排都是连续的整数 如下:
     *    1   2   3   4
     *    2   3   4   5
     *    3   4   5   6
     */
    public static void h4(){
        int row=4;
        int column=4;
        int[][] nums=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                nums[i][j]=1+i+j;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }

    /**
     * b.定义两个数组实现两个数组合并  并且元素升序排序
     */
    public static void h5(){
        int[] nums1={2,12,-5,6,1};
        int[] nums2={13,2,10,-4,8};
        System.out.println("数组一:"+Arrays.toString(nums1));
        System.out.println("数组二:"+Arrays.toString(nums2));
        int[] newNums=new int[nums1.length+nums2.length];
        for(int i=0;i<newNums.length;i++){
            if(i<nums1.length){
                newNums[i]=nums1[i];
            }else{
                newNums[i]=nums2[i-nums1.length];
            }
        }
        System.out.println("合并后:"+Arrays.toString(newNums));
        for(int i=0;i<newNums.length-1;i++){
            for(int j=0;j<newNums.length-1-i;j++){
                if(newNums[j]>newNums[j+1]){
                    newNums[j]= newNums[j]^newNums[j+1];
                    newNums[j+1]= newNums[j]^newNums[j+1];
                    newNums[j]= newNums[j]^newNums[j+1];
                }
            }
        }
        System.out.println("升序排序后:"+Arrays.toString(newNums));
    }
}

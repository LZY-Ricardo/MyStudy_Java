package day3;

import java.util.*;

public class Thomework {
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
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                sum+=nums[i][j];
            }
        }
        System.out.println("总和: "+sum);
        int sum2=0;
        for(int[] i:nums){
            for(int j:i){
                sum2+=j;
            }
        }
        System.out.println("总和2: "+sum);
    }

    /**
     * b. 有一段乱序的字符  'a','c','u','b','e','p','f','z',
     * 请按照英文字母表的顺序升序排列
     */
    public static void h2(){
       char[] cs1={'a','c','u','b','e','p','f','z'};
        System.out.println("冒泡排序前:"+Arrays.toString(cs1));
        for(int i=0;i<cs1.length-1;i++){
            for(int j=0;j<cs1.length-1-i;j++){
                if(cs1[j]>cs1[j+1]){
                    char temp=cs1[j];
                    cs1[j]=cs1[j+1];
                    cs1[j+1]=temp;
                }
            }
        }
        System.out.println("冒泡排序后:"+Arrays.toString(cs1));


        char[] cs2={'a','c','u','b','e','p','f','z'};
        System.out.println("冒泡排序前:"+Arrays.toString(cs2));
        for(int i=0;i<cs2.length-1;i++){
            int index=i;
            for(int j=i+1;j<cs2.length;j++){
                if(cs2[index]>cs2[j]) index=j;
            }
            if(index!=i){
                char temp=cs2[i];
                cs2[i]=cs2[index];
                cs2[index]=temp;
            }
        }
        System.out.println("冒泡排序后:"+Arrays.toString(cs2));


        char[] cs3={'a','c','u','b','e','p','f','z'};
        System.out.println("冒泡排序前:"+Arrays.toString(cs3));
        for(int i=0;i<cs3.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(cs3[j]<cs3[j-1]){
                    char temp=cs3[j];
                    cs3[j]=cs3[j-1];
                    cs3[j-1]=temp;
                }
            }
        }
        System.out.println("冒泡排序后:"+Arrays.toString(cs3));
    }

    /**
     * c. 根据上一道题继续完成,手动输入一个字符插入的到排序后的列表中去
     *    插入后也要满足升序的顺序
     */
    public static void h3(){
        char[] cs1={'a','c','u','b','e','p','f','z'};
        System.out.println("排序前:"+Arrays.toString(cs1));
        for(int i=0;i<cs1.length-1;i++){
            for (int j=0;j<cs1.length-1-i;j++){
                if(cs1[j]>cs1[j+1]){
                    char temp=cs1[j];
                    cs1[j]=cs1[j+1];
                    cs1[j+1]=temp;
                }
            }
        }
        System.out.println("排序后:"+Arrays.toString(cs1));
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要插入的字符：");
        String s=sc.next();
        //java中String的方法 可以获取指定位置的字符
        //charAt(字符)
        char ch=s.charAt(0);

        char[] newcs1=new char[cs1.length+1];
        //将老数组的元素 赋值给新数组
        for(int i=0;i<cs1.length;i++){
            newcs1[i]=cs1[i];
        }
        //计算出插入的位置
        int index=newcs1.length-1;
        for(int i=0;i<cs1.length;i++){
            if(ch<cs1[i]){
                index=i;
                break;
            }
        }
        //元素后移
        for(int i=newcs1.length-1;i>index;i--){
           newcs1[i]=newcs1[i-1];
        }
        //插入新元素
        newcs1[index]=ch;
        System.out.println("插入后:"+Arrays.toString(newcs1));
    }

    /**
     * a.通过编程实现一个长度都是4的二维数组,
     * 数组的第一个值是1, 其他值无论是横排 还是纵排都是连续的整数 如下:
     *    1   2   3   4
     *    2   3   4   5
     *    3   4   5   6
     */
    public static void h4(){
        int[][] nums=new int[4][4];
        for(int i=0;i<nums.length;i++){
            int result=i+1;
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=result;
                result++;
            }
        }
        System.out.println("结果是:");
        for(int[] i:nums){
            System.out.println(Arrays.toString(i));
        }
    }

    /**
     * b.定义两个数组实现两个数组合并  并且元素升序排序
     */
    public static void h5(){
//        List<Integer> list=new ArrayList<>();
//        list.containsAll();
//        Collections.sort();
        int[] num1={10,5,7,15,30};
        int[] num2={20,15,7,5,28,7,3};
        int[] newNum=new int[num1.length+num2.length];
        for(int i=0;i<num1.length;i++){
            newNum[i]=num1[i];
        }
        for(int i=0;i<num2.length;i++){
            newNum[i+ num1.length]=num2[i];
        }
        //排序
        for(int i=0;i<newNum.length-1;i++){
            for(int j=0;j<newNum.length-1-i;j++){
                if(newNum[j]>newNum[j+1]){
                    newNum[j]=newNum[j]^newNum[j+1];
                    newNum[j+1]=newNum[j]^newNum[j+1];
                    newNum[j]=newNum[j]^newNum[j+1];
                }
            }
        }
        System.out.println("数组1:"+Arrays.toString(num1));
        System.out.println("数组2:"+Arrays.toString(num2));
        System.out.println("数组合并排序后:"+Arrays.toString(newNum));
    }
    public String test(){
        String name="100";
        return name;
    }
    //特殊情况
    //因为A是B的父类  B的类型也属于A的类型
    public A test2(){
        A a=new A();
        B b=new B();
        return b;
    }
}
class A{

}
//B继承了A类
class B extends A{

}
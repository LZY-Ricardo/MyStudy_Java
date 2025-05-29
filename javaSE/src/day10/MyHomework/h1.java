package day10.MyHomework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class h1 {
    //a.求一个5*5矩阵两条对角线元素之和
    //程序分析：利用双重for循环控制输入二维数组，再将a[i][j]累加后输出。
    //1 2 3 4 5
    //6 7 8 9 10
    //11 12 13 14 15
    //16 17 18 19 20
    //21 22 23 24 25
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j){
                    sum+=nums[i][j];
                }
            }
        }
        System.out.println("对角线元素之和: "+sum);
    }
    //a.定义ArrayList集合，存入如下字符串：“abc”，“123”，“java”，“mysql”，“别跑啊”
    //   遍历集合，将长度小于4的元素左边填充字符串0，并在控制台打印输出修改后集合中所有元素
    //**输出结果格式： ** [0abc,0123,java,mysql,0别跑啊]
    @Test
    public void test1(){
        List list=new ArrayList();
        list.add("abc");
        list.add("123");
        list.add("java");
        list.add("mysql");
        list.add("别跑啊");
        for(int i = 0; i < list.size(); i++){
            if((list.get(i)).toString().length()<4){
                for(int j=0;j<4-(list.get(i)).toString().length();j++){
                    list.set(i,"0"+list.get(i));
                }
            }
        }
        System.out.println(list);
    }
}

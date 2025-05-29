package day2;
//定义数组
public class Demo5 {
    public static void main(String[] args) {
        //1.声明数组
        String[] strs;
        String strs2[][];
        //2.声明数组  分配空间
        int[] nums=new int[5];
        //3.声明数组 分配空间 直接赋值
        int[] nums2=new int[]{10,20,30};
        System.out.println(nums2.length);
        String[] strs3={"aa","bb"};
        System.out.println(strs3.length);
        //定义多维数组
        double[][] scores={{15.5,25.5},{15.5,25.5,15.6},{}};

        //笔试题1: 下列哪些声明数组的方式是正确的(CDE)
        //A. int[3][4] array;
        //B. int[3][]  array;
        //C. char[]  array[];
        //D. String[][] array;
        //E. Object  array[][];
        //F. Object  array[][3];

        //笔试题2: 下列哪个是定义数组不正确的方式(C)
        //A. char[][] c=new char[2][4];
        //B. char c[][]=new char[2][];
        //需要先有外层数组 才可以有内层数组
        //C. char[][] c=new char[][3];
        //D. char[] c[]=new char[5][5];
    }
}

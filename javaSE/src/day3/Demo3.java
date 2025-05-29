package day3;
//递归: 就是通过自己调用自己,还提供一个结束的出口
//否则容易出现栈内存溢出错误(StackOverflowError)
//原因方法调用jvm会创建栈帧来表示方法运行过程
//方法无限嵌套自己 无限创建栈帧 比较耗费栈内存
//5!=5*4*3*2`*1;  ==> 5!=4!*5; ==>4!=3!*4==>1!=1
public class Demo3 {
    public static void main(String[] args) {
        int result=demo(5);
        System.out.println(result);
    }
    //设计一个实现 递归计算数字阶乘
    public static int demo(int n){
        //递归出口
        if(n==1) return 1;
        //无限递归调用自己
        return demo(n-1)*n;
    }
}
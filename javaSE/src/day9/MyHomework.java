package day9;

import day9.exception.BalanceException;
import day9.exception.NegativeException;
import day9.exception.OverWeightException;

import java.util.List;
import java.util.Scanner;

public class MyHomework {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
//        try {
//            Bank bank=new Bank(100);
//            bank.toString();
//            bank.withDrawl(150);
//            System.out.println("取款成功");
//        }catch(BalanceException | NegativeException e){
//            System.err.println(e.getMessage());
//        }
//        try{
//            Bank bank=new Bank(100);
//            bank.toString();
//            bank.withDrawl(-15);
//            System.out.println("取款成功");
//        }catch(BalanceException | NegativeException e){
//            System.err.println(e.getMessage());
//        }
        //test2();
    }
    //a.创建两个自定义异常MyException1和MyException2
    //   要求:MyException1是检查性异常，MyException2是非检查性异常
    //          两个异常均有两个构造方法，一个无参  一个带参数
    //          参数表示异常的详细信息
    public class MyException1 extends Exception{
        public MyException1(String msg){
            super(msg);
        }
        public MyException1(){
            super();
        }
    }
    public class MyException2 extends RuntimeException{
        public MyException2(String msg){
            super(msg);
        }
        public MyException2(){
            super();
        }
    }
    //b.建立exception包，建立Bank类，类中有变量double balance表示存款,
    // Bank类的构造方法能增加存款，
    // Bank类中有取款的发方法withDrawl(double dAmount),
    // 当取款的数额大于存款时,抛出BalanceException
    // 取款数额为负数，
    // 抛出NegativeException,
    // 如new Bank(100),表示存入银行100元，
    // 当用方法withdrawal(150)，withdrawal(-15)时会抛出自定义异常。
    //BalanceException    自定义异常   表示余额不足
    //NegativeException   自定义异常   表示取款数不能为负数
    //a.打印出杨辉三角形（要求打印出10行如下图）
    //程序分析： 它的两个边都是1，内部其它都是肩上两个数的和
    //       1
    //      1 1
    //     1 2 1
    //    1 3 3 1
    //   1 4 6 4 1
    //1 5 10 10 5 1
    public static void test1(){
        int[][] nums=new int[10][];
        for(int i=0;i<nums.length;i++){
            nums[i]=new int[i+1];
            nums[i][0]=1;
            nums[i][i]=1;
            for(int j=1;j<nums[i].length-1;j++){
                nums[i][j]=nums[i-1][j-1]+nums[i-1][j];
            }
            for(int j=0;j<nums.length-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    //b. 模拟向货船上装载集装箱，每个集装箱有一定重量，
    // 该重量（整数）大于100小于1000，货船总重为1000，
    // 装载若干集装箱后，如果货船超重，那么货船认为这是一个异常，
    // 将拒绝装载集装箱，但无论是否发生异常，货船都需要正点启航。
    //比如:输入:
    //199        输出:  目前装载了199吨货物
    //400        输出:  目前装载了599吨货物
    //300        输出:  目前装载了899吨货物
    //300        输出:  超重
    //无法再装载重量是300吨的集装箱
    //货船将正点启航
    //提示: 使用自定义异常
    public static void test2(){
        int weight=0;
        try{
            while(true){
                System.out.println("目前装载了"+weight+"吨货物");
                System.out.println("请输入要装载的集装箱重量");
                int input=sc.nextInt();
                if(input>100&&input<1000){
                    weight+=input;
                }else{
                    System.out.println("集装箱重量必须大于100小于1000");
                }
                if(weight>1000){
                    throw new OverWeightException("无法再装载重量是"+input+"吨的集装箱");
                }
            }
        }catch(OverWeightException e){
            System.err.println("超重");
            System.err.println(e.getMessage());
        }finally {
            System.out.println("货船将正点启航");
        }
    }
}
 class Bank{
    double balance;
    public Bank(double balance){
        if(balance>0){
            this.balance+=balance;
        }else{
            try{
                throw new NegativeException("存款数不能为负数");
            }catch(NegativeException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public void withDrawl(double dAmount) throws BalanceException,NegativeException{
        if(dAmount>balance){
            throw new BalanceException("余额不足");
        }else if(dAmount<0){
            throw new NegativeException("取款数不能为负数");
        }else{
            balance-=dAmount;
        }
    }
     @Override
     public String toString() {
         return "Bank{" +
                 "balance=" + balance +
                 '}';
     }
 }

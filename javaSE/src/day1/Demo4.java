package day1;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        demo2();
    }
    /**
     * 商城根据会员积分打折
     * 2000分之内  打9折
     * 4000分之内  打8折
     * 8000分之内  打7.5折
     * 8000分以上  打7折
     * 手动输入购物金额  和  积分  计算出  支付金额
     */
    public static void demo1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购物金额：");
        double money = sc.nextDouble();
        System.out.println("请输入用户积分：");
        int code=sc.nextInt();
        double zhekou=0;
        //if 有一种简化版 如果if里面只有一行代码 可以省略{}
        if (code < 2000) zhekou=0.9;
            //判断条件2时候  条件1不满足
        else if(code <4000) zhekou=0.8;
        else if(code < 8000) zhekou=0.75;
        else zhekou=0.7;
        double result=money*zhekou;
        System.out.println("目前折扣："+zhekou*10+"折");
        System.out.println("支付金额："+result);
    }
    /**
     * 出票系统：根据淡旺季的月份和年龄，打印票价
     * 4-10月是旺季：
     * 成人（19-60）：60
     * 儿童（<19）：半价
     * 老人（）：1/3
     * 淡季：成人：40
     *      其他：20
     *      单重if    if-else   多重if
     */
    public static void demo2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份:");
        int month=sc.nextInt();
        System.out.println("请输入年龄:");
        int age=sc.nextInt();
        double price=0;
        //先判断是否是淡季和旺季
        if(month>=4 && month<=10){  //4-10月份
            if(age>=19 && age<=60) price=60;
            else if(age<18) price=60/2;
            else price=60/3;
        }else{  //除了4-10月份  淡季
            if(age>=19 && age<=60) price=40;
            else price=40/2;
        }
        System.out.println("票价:"+price+"元");
    }
}

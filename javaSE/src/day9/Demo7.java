package day9;

import java.util.InputMismatchException;
import java.util.Scanner;

//捕获异常
public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums=new int[3];
        String[] strs=new String[3];
        //try{} 代码块不可以单独编写
        //try{}catch{} 合法的 try{}finally{}
        //try{}catch{}finally{} try{} 不合法的
        try {
            for (int i = 0; i < nums.length; i++){
                System.out.println("请输入一个数字");
                nums[i]=sc.nextInt(); //如果出现了 进入catch
                //try里面的下面的代码不会执行
                strs[i]=nums[i]+"java";
            }
        }catch (NullPointerException e){
            System.out.println("出现空指针异常");
        }catch (InputMismatchException e) {
            System.out.println("出现了输入参数异常");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("出现了越界异常");
        }catch (Exception e){ //出现了异常 也可以解决
            System.out.println("出现了其他异常");
            //多重catch 先写小范围异常 再写大范围异常
        }finally{ //无论是否发生异常 我都执行
            System.out.println("我是finally都会执行");
        }
        System.out.println("程序运行结束了");
    }
}

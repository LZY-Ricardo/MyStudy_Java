package day5;

import java.util.Scanner;

//果汁的接口
public interface Fruit {
    //生成果汁的方法
    void product();
}
//      子类          父类
class Apple implements Fruit {
    //需要实现(重写)接口方法
    public void product() {
        System.out.println("开始生成苹果汁");
    }
}
class oriange implements Fruit {
    public void product() {
        System.out.println("开始生成橙汁");
    }
}
class TestFruit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你所需要的果汁(1.苹果汁 2.橙汁 3.  4.  )");
        int n = sc.nextInt();
        Fruit f=null;
        switch (n){
            case 1: f= new Apple();break;
            case 2: f= new oriange();break;
        }
        f.product();
    }
}
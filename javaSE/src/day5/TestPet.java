package day5;

import day4.User;

import java.util.Scanner;

public class TestPet {
    public static void main(String[] args) {
        //宠物：姓名 健康值 友好度 颜色  品种...
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要领养宠物的名称：");
        String name = sc.next();
        System.out.println("请输入你选择宠物的类型(1.狗\t2.猫\t3.企鹅\t)");
        int n = sc.nextInt();
        //先声明好父类引用
        Pet p=null;
        switch (n){
            case 1:
                p= new Dog();
                System.out.println("请输入狗的品种:");
                String type = sc.next();
                //父类类型不能使用子类独有资源
                //解决方案就是强制类型转换
                //Dog dog=(Dog)p;
                //dog.type=type;
                ((Dog)p).type=type;
                break;
            case 2:
                p= new Cat();
                System.out.println("请输入猫的颜色:");
                String color = sc.next();
                ((Cat)p).color=color;
                break;
            case 3:
                p= new Penguin(); break;
                //...
        }
        p.name=name;
        //为什么有的打印猫 有的狗的方法
        //要看p对象实际指向谁  p=new Dog()  指向狗
        //指向谁  就会调用谁  谁重写后的方法
        p.print();

//        Controller Service mapper
//                父类      子类对象
//        UserService us=new UserServiceImpl();
    }
}

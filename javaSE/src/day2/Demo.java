package day2;

import day3.Student;

import java.util.Scanner;

public class Demo {
    //案例:设计一个程序 选择不同的图形（1.长方形 2.正方形 3.三角形 4.圆形）
    //根据用户输入的不同  求出不同图形的面积
    //记住快捷键 psvm+tab 键 自动生成main方法
    public static void main(String[] args) {
        //快捷打印语句   sout+tab键
        System.out.println("选择不同的图形（1.长方形 2.正方形 3.三角形 4.圆形）");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
//        if(n==1) tuxing1(sc);  //sc属于实际参数(实参)
//        else if(n==2) tuxing2(sc);
//        else if(n==3) tuxing3(sc);
//        else if(n==4) tuxing4(sc);
        //byte short int char 可以隐式转成int
        //String 在jdk1.7之后也支持switch
        switch(n){  //表达式：可以编写成隐式转换成int
            case 1:tuxing1(sc); break;
            case 2:tuxing2(sc); break;
            case 3:tuxing3(sc); break;
            case 4:tuxing4(sc); break;
            default: System.out.println("这是默认情况");break;
        }
        //抽奖功能  有时 可以省略break
        //1 一等奖 2-3 二等奖  3-10 三等奖
        switch (n){
            case 1: System.out.println("一等奖"); break;
            case 2: case 3:
                System.out.println("二等奖"); break;
        }
    }
    public static void tuxing1(Scanner aa){
        System.out.println("请输入长 和 宽:");
        int l=aa.nextInt();
        int d=aa.nextInt();
        System.out.println("面积:"+l*d);
    }
    public static void tuxing2(Scanner bb){
        System.out.println("请输入边长");
        int l=bb.nextInt();
        System.out.println("面积:"+l*l);

    }
    public static void tuxing3(Scanner cc){
        System.out.println("请输入底 和 高:");
        int l=cc.nextInt();
        int d=cc.nextInt();
        System.out.println("面积:"+l*d);
    }
    public static void tuxing4(Scanner dd){
        System.out.println("请输入半径:");
        int l=dd.nextInt();
        System.out.println("面积"+3.14*l);

    }

}
//      子类          继承  父类
class TestStudent2 extends Student{
    public void test(){
        //其他类使用别的类资源 需要创建对象
        Student stu = new Student();
        TestStudent2 ts=new TestStudent2();
        //对象名.属性名
        System.out.println(stu.name);
        //子类可以访问受保护的资源
        System.out.println(ts.age);
//        System.out.println(stu.score);
//        System.out.println(stu.sex);
    }
}
class TestStudent3{
    public void test(){
        //其他类使用别的类资源 需要创建对象
        Student stu = new Student();
        //对象名.属性名
        System.out.println(stu.name);
//        System.out.println(stu.age);
//        System.out.println(stu.score);
//        System.out.println(stu.sex);
    }
}
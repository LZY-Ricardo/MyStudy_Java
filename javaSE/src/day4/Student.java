package day4;

import java.util.Scanner;

//构造方法:
//1.用于创建对象  new 对象() 就是调用构造方法的过程
//2.一般用于给属性做初始化
public class Student {
    String name;
    String sex;
    int age;
    public void print(){
        System.out.println("我是:"+name+
                ",我今年"+age+"岁,性别:"+sex);
    }
    //默认会存在一个无参构造,但是如果手动编写默认的就失效
    public Student(){
        System.out.println("执行了无参构造方法");
    }
    //构造方法可以提供多个(前提参数列表不同,类型 个数 顺序)
    public Student(String name){
        System.out.println("执行了有参构造方法");
    }
    public Student(String a,int b){

    }
    public  Student(int a,String b){

    }
    public Student(int a,int b){

    }
    public Student(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    //构造方法为什么可以提供多个 ,因为java支持方法重载
    //方法重载:....
}
class TestStudent{
    public static void main(String[] args) {
        Student stu=new Student("张三");
        Student stu2=new Student();
        Student stu3=new Student(10,"bb");
        System.out.println(stu);

//        Student s=new Student();
//        s.name="张三";
//        s.sex="男";
//        s.age=18;
//        s.print();

        Student s=new Student("张三","男",18);
        s.print();
    }
}

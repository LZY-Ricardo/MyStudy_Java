package day3;

import java.util.Scanner;

//测试访问修饰符: 本类  同包  子类  其他包
public class Student {
    //属性
    public String name; //姓名
    protected int age;//年龄
    double score;//成绩
    private boolean sex;//性别
    //方法  测试本类访问修饰符可用性
    public void test(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
        System.out.println(sex);
    }
}
class TestStudent{
    public void test(){
        //其他类使用别的类资源 需要创建对象
        Student stu=new Student();
        //对象名.属性名
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.score);
        //System.out.println(stu.sex);
    }
}

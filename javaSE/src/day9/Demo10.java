package day9;

import java.util.Scanner;

//自定义异常
public class Demo10 {
    public static void main(String[] args) {
        //通过手动输入 给用户对象设置属性,如果属性不合法
        //通过自定义异常来进行控制
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入性别(男或女):");
        String sex = sc.next();
        System.out.println("请输入年龄(1-120):");
        int age = sc.nextInt();
        User u=new User();
        u.setName(name);
        u.setAge(age);//验证
        u.setSex(sex);//验证
        u.print();
    }
}
//自定义年龄异常 属于运行时异常
class AgeException extends RuntimeException{
    public AgeException(String msg) {
        super(msg);
    }
}
//自定义性别异常 属于检查性异常
class SexException extends Exception{
    public SexException(String msg){
        super(msg);
    }
}
class User{
    private String name;
    private String sex;
    private int age;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex){
        if("男".equals(sex) || "女".equals(sex)){
            this.sex=sex;
        }else{//不合法 自定义异常
            try{
                throw new SexException("性别设置不合法,默认值男");
            }catch(SexException e){
                System.err.println(e.getMessage());
                this.sex="男";
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=1 && age<=120) {
            this.age = age;
        }else{//不合法 自定义异常处理
            try {
                throw new AgeException("年龄设置只能在1-120之间 年龄设置有误,默认值18");
            }catch(AgeException e){
                System.err.println(e.getMessage());
                this.age=18;
            }
            //try-catch-finally快捷键
            //先选中要处理异常的部分ctrl+alt+T
            try {
                System.out.println("呵呵1");
                System.out.println("呵呵2");
                System.out.println("呵呵3");
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
            }
        }
    }


    public void print(){
        System.out.println("我是:"+name+",我今年"+age+"岁,性别:"+sex);
    }
}

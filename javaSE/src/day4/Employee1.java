package day4;
//1.定义一个Employee类（员工类） 属性:姓名  年龄 性别 工资
//方法:print() 打印员工基本信息
//addSal() 给员工加薪1000元 并给出提示涨薪多少元 20000封顶
//要求对该类进行封装  年龄在1-100之间     性别男或者女    工资1~20000封顶
public class Employee1 {
    String name;
    int age;
    String sex;
    double sal;
    public void print(){
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
        System.out.println("性别:"+sex);
        System.out.println("工资:"+sal);
    }
    //setXXX 设置属性的  一般是带参数的   没有返回值
    public void setName(String name){
        this.name=name;
    }
    //getXXX 获取属性的  一般是返回值  参数可以没有
    public String getName(){
        return name;
    }
    //其他可以自动生成 alt+insert(ins) get 和 set

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1 && age<=100){
            this.age = age;
        }else{
            System.out.println("年龄设置不合法,默认值18");
            this.age=18;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if("男".equals(sex) || "女".equals(sex)){
            this.sex=sex;
        }else{
            System.out.println("性别设置不合法,默认值男");
            this.sex = sex;
        }
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        if(sal>1 && sal<=20000){
            this.sal=sal;
        }else{
            System.out.println("工资设置不合法,默认值5000");
            this.sal=sal;
        }
    }
    //加薪
    public void addsal(){
        if(sal+1000<=20000){
            this.sal+=1000;
            System.out.println("员工涨薪1000元");
        }else{
            System.out.println("员工涨薪"+(20000-sal)+"元");
            this.sal=20000;
        }
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1();
        e.setName("zz");
        e.setAge(1000);
        e.setSex("男");
        e.setSal(17500);
        e.print();
        e.addsal();
        e.addsal();
        e.addsal();
        e.print();
    }
}

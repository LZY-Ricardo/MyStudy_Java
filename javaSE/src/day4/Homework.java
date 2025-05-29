package day4;

public class Homework {
    public static void main(String[] args) {
//        Employee emp = new Employee();
//        emp.setName("小王");
//        emp.setSalary(5000);
//        emp.setAge(20);
//        emp.setGender("男");
//        emp.addSal();
//        System.out.println(emp.print());
//        Vehicle v=new Vehicle(15,"15立方米");
//        v.move();
//        v.setSpeed(20);
//        v.speedUp();
//        v.speedDown();
//        v.print();
//        regularEmployee re=new regularEmployee(150,30,1);
//        re.print();
//        departmentManager dm=new departmentManager(200,30,1.2);
//        dm.print();
//        emp e=new departmentManager(250,30,1.3);
//        e.print();
//        Circle c=new Circle(1.5);
//        c.getArea();
//        c.getPerimeter();
//        Draw draw = new Draw();
//        draw.drawPra();
//        System.out.println("-----------------------");
//        draw.drawRec();
//        System.out.println("-----------------------");
//        draw.drawTrian();
}
}
/**1.定义一个Employee类（员工类） 属性:姓名  年龄 性别 工资
 方法:print() 打印员工基本信息
 addSal() 给员工加薪1000元 并给出提示涨薪多少元 20000封顶
 要求对该类进行封装  年龄在1-100之间     性别男或者女    工资1~20000封顶**/
class Employee{
    private String name;
    private int age;
    private String gender;
    private int salary;

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
        if(age<=100&&age>0){
            this.age = age;
        }else{
            System.out.println("输入年龄有误,默认18岁");
            this.age=age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if("男".equals(gender)||"女".equals(gender)){
            this.gender=gender;
        }else{
            System.out.println("输入性别有误,默认男性");
            this.gender=gender;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary>=1&&salary<=20000){
            this.salary=salary;
        }else{
            System.out.println("输入薪水有误,默认3000元");
            this.salary=salary;
        }
    }

    public String print() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void addSal(){
        if(this.salary+1000<=20000){
            System.out.println("给该员工加薪1000元");
            this.salary+=1000;
        }else{
            System.out.println("加薪失败,员工薪水不能超过20000元");
        }
    }
}
/**2.请定义一个交通工具(Vehicle)的类其中有:
 * 属性： 速度(speed)、 体积(size)等，
 * 方法：移动(move())、设置速度(setSpeed(int speed))、加速 speedUp()、减速 speedDown()等。
 * 最后在测试类 Vehicle 中的 main()中实例化一个交通工具对象并通过方法给它初始化 speed,size 的值并且通过打印出来。
 * 另外调用加速、减速的方法对速度进行改变**/
class Vehicle{
    int speed;
    String size;
    public Vehicle(int speed,String size) {
        this.speed = speed;
        this.size = size;
    }
    public void move(){
        System.out.println("该交通工具正在移动");
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void speedUp(){
        this.speed+=1;
        System.out.println("交通工具已加速1km/h,速度为:"+this.speed+"km/h");
    }
    public void speedDown(){
        this.speed-=1;
        System.out.println("交通工具已减速1km/h,速度为:"+this.speed+"km/h");
    }
    public void print(){
        System.out.println("该交通工具体积为"+this.size+"\t速度为:"+this.speed+"km/h");
    }
}
/**3.通过继承实现员工工资核算打印功能
 a、有员工类（父类），普通员工类（员工类的子类）和部门经理类（员工类的子类）
 普通员工工资=单日工资* 天数 * 等级（1）；部门经理工资=1000+单日工资天数等级（1.2）。
 b、
 员工类的属性和方法
 属性：单日工资，工作天数，工资等级
 方法：打印工资方法
 c、子类按照本类特点重写打印工资方法
 d、写测试类，输出各类的工资（同时代码验证重写的规则）
 */
class emp{
    double dailyWage;
    int workDays;
    double wageLevel;
    public emp(double dailyWage,int workDays,double wageLevel){
        this.dailyWage=dailyWage;
        this.workDays=workDays;
        this.wageLevel=wageLevel;
    }
    public void print(){
        System.out.println("工资计算方式");
    }
}
class regularEmployee extends emp{
    public regularEmployee(double dailyWage,int workDays,double wageLevel){
        super(dailyWage,workDays,wageLevel);
    }
    public void print(){
        double salary=dailyWage*workDays*wageLevel;
        System.out.println("普通员工工资:"+salary);
    }

}
class departmentManager extends emp{
    public departmentManager(double dailyWage,int workDays,double wageLevel){
        super(dailyWage,workDays,wageLevel);
    }
    public void print(){
        double salary=1000+(dailyWage*workDays*wageLevel);
        System.out.println("部门经理工资:"+salary);
    }
}
/**1.定义一个圆类——Circle，在类的内部提供一个属性：半径®，同时 提供 两个 方 法 ：
 *  计算 面积 （ getArea() ） 和 计算 周长（getPerimeter()） 。
 *  通过两个方法计算圆的周长和面积并且对计算结果进行输出。最后定义一个测试类对 Circle 类进行使用
 */
class Circle{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public void getArea(){
        System.out.println("圆的面积:"+this.radius*this.radius*Math.PI);
    }
    public void getPerimeter(){
        System.out.println("圆的周长:"+this.radius*2*Math.PI);
    }
}
/**2.定义一个类 Draw ， 在 类 中 提供 3 个 方法：
 * 输出直角三角形（drawTrian()） 、 输出矩形（drawRec()） 及平行四边形（drawPra()） 。
 * 通过方法可以输出由“*” 组成的一个图形 。最后在测试类中进行调用
 */
class Draw{
    public void drawTrian(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void drawRec(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void drawPra(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5+i;j++){
                if(j>i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
package day6;
//测试静态修饰符
public class Student {
    //成员变量: 实例变量
    String course;
    double score;
    //静态变量: 类变量
    static String grade;

    //普通方法: 实例方法   可以调用任意属性和方法
    public void study(){
        System.out.println(course);
        System.out.println(score);
        System.out.println(grade);
        exam();
    }
    //静态方法: 类方法  只能直接访问静态属性和方法
    //this是否可以在static方法中使用
    public static void exam(){
        //System.out.println(course);
        System.out.println(grade);
        Student s=new Student();
        System.out.println(s.course);
        play();
        //study();
    }
    public static void play(){

    }
    public static void main(String[] args) {
       Student s1=new Student();
       Student.grade="sc早鸟班";
       Student s2=new Student();
       s2.grade="正式班";
       System.out.println(s1.grade+" "+s2.grade);
    }
}

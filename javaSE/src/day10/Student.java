package day10;
//如何实现浅克隆(浅拷贝)
//1.实现Cloneable接口(里面没有任何功能,只表示当前类支持克隆)
//2.重写Object类clone()方法 用于实现克隆的逻辑

//如何实现深克隆(深拷贝)
//1.实现Cloneable接口(里面没有任何功能,只表示当前类支持克隆)
//2.重写Object类clone()方法 用于实现克隆的逻辑
//3.如果对象中存在引用类型的属性 也需要是实现上面的接口 重写clone()方法
//4.上面重写clone() 也需要去调用下面的clone()方法 用于给引用类型的属性赋值
public class Student implements Cloneable {
    Integer id;
    String name;
    Score score;
    @Override
    public Student clone() throws CloneNotSupportedException {
        Student s= (Student)super.clone();//不能删除
        //4.
        s.score=s.score.clone();
        return s;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student();
        s1.id=10;
        s1.name="张三";
        Score score =new Score();
        score.coursename="java";
        score.degree=90;
        s1.score = score;
        //CloneNotSupportedException 克隆不支持异常 检查性异常
        Student s2=s1.clone();
        //如何观察克隆是否成功:s1和s2只有是不同的引用地址才是成功的
        //这样 s1和s2 才是两个独立的对象
        System.out.println(s1);
        s1.name="aaa";
        System.out.println(s1.id+" "+s1.name+" "+s1.score);
        System.out.println(s2);
        System.out.println(s2.id+" "+s2.name+" "+s2.score);
    }
}
class Score implements Cloneable{
    String coursename;
    double degree;
    @Override
    public Score clone() throws CloneNotSupportedException {
        return (Score)super.clone();
    }
}

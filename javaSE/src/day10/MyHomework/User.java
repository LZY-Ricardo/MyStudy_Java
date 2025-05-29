package day10.MyHomework;
//b.有一个User对象(id,name,info对象)  , info对象(id,sex,age)  通过深克隆的方式
//克隆User对象
public class User implements Cloneable{
    public int id;
    public String name;
    public Info info;

    public User clone() throws CloneNotSupportedException {
        User u=(User)super.clone();
        u.info=(Info)info.clone();
        return u;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        User u = new User();
        u.id = 1;
        u.name = "user";
        Info info=new Info();
        info.id=2;
        info.sex="男";
        info.age=18;
        u.info=info;
        User u2=u.clone();
        System.out.println(u);
        System.out.println(u.id+" "+u.name+" "+u.info);
        System.out.println("--------------------------");
        System.out.println(u2);
        System.out.println(u2.id+" "+u2.name+" "+u2.info);
    }
}
class Info implements Cloneable{
    public int id;
    public String sex;
    public int age;

    public Info clone() throws CloneNotSupportedException {
        return (Info)super.clone();
    }
}

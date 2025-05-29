package day5;
/*a.写一个Java应用程序，
主要是体现父类子类间的继承关系。
父类：鸟，子类：麻雀(sparrow)、鸵鸟(ostrich)、鹰(eagle)。
子类继承父类的一些特点，如都是鸟的话就都会有翅膀、两条腿等，
但它们各自又有各自的特点，如麻雀的年龄、体重；
鸵鸟的身高、奔跑速度；
鹰的捕食、飞翔高度等*/
public class Bird1 {
    String name;
    int wings=2;
    int legs=2;
    public void chirp(){
        System.out.println("鸟叫");
    }
    public Bird1(String name) {
        this.name = name;
    }
    public void print(){
    }
}
class Sparrow1 extends Bird1{
    int age;
    double weight;
    public void print(){
        System.out.println(name + " wings:" + wings + " legs:" + legs +" age:" + age + " weight:" + weight);
    }
    public Sparrow1(String name,double weight,int age) {
        super(name);
        this.age=age;
        this.weight=weight;
    }
}
class Ostrich1 extends Bird1{
    double height;
    double speed;
    public Ostrich1(String name,double height,double speed) {
        super(name);
        this.height=height;
        this.speed=speed;
    }
    public void print(){
        System.out.println(name + " wings:" + wings + " legs:" + legs + " height:" + height + " speed:" + speed);
    }
}
class Eagle1 extends Bird1{
    boolean canHunt=true;
    double flyHeight;
    public Eagle1(double flyHeight,String name) {
        super(name);
        this.flyHeight=flyHeight;
    }
    public void print(){
        System.out.println(name + " wings:" + wings + " leg:" + legs + " flyHeight:" + flyHeight+" eagle can hunt?"+canHunt);
    }

    public static void main(String[] args) {
        Sparrow1 s=new Sparrow1("Sparrow",1,2);
        Ostrich1 o=new Ostrich1("Ostrich",3,4);
        Eagle1 e=new Eagle1(100,"Eagle");
        s.chirp();
        s.print();
        o.chirp();
        o.print();
        e.chirp();
        e.print();
    }
}


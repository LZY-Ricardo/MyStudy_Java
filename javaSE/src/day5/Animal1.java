package day5;
/*b.请编码实现动物世界的继承关系：
动物（Animal）具有行为：吃（eat）、睡觉（sleep）、移动（move）
动物包括：兔子（Rabbit），老虎（Tiger）,鹰（eagle）
这些动物吃、移动的行为各不相同（eat，move动作不同）；但睡觉的行为是一致的*/
public class Animal1 {
    public void eat() {
    }
    public void sleep() {
        System.out.println("sleep");
    }
    public void move(){
    }
}
class Rabbit1 extends Animal1{
    public void eat() {
        System.out.println("rabbit eat");
    }
    public void move() {
        System.out.println("rabbit move");
    }
}
class Tiger1 extends Animal1{
    public void eat() {
        System.out.println("tiger eat");
    }
    public void move() {
        System.out.println("tiger move");
    }
}
class Eaglee1 extends Animal1{
    public void eat() {
        System.out.println("eaglee eat");
    }
    public void move() {
        System.out.println("eaglee move");
    }

    public static void main(String[] args) {
        Rabbit1 R = new Rabbit1();
        Tiger1 T = new Tiger1();
        Eaglee1 E = new Eaglee1();
        R.eat();
        R.move();
        R.sleep();
        System.out.println("----------");
        T.eat();
        T.move();
        T.sleep();
        System.out.println("----------");
        E.eat();
        E.move();
        E.sleep();
    }
}


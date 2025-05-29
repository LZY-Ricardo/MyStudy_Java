package day4;
//继承        子类        父类
public class Cat extends Pet{
    String color;//颜色
    //@Override 可以省略 用于标注是否时重写
    public void print(){
        System.out.println("猫基本信息");
        //子类可以使用父类非私有资源
        System.out.println(name);
        System.out.println(health);
        System.out.println(love);
        System.out.println(color);
    }
}
class Tiger extends Pet{
    String type;//品种
    //方法的重写 : 为了更好体现出子类自己的特性
    @Override
    public void print(){
        System.out.println("老虎基本信息");
        //子类可以使用父类非私有资源
        System.out.println(name);
        System.out.println(health);
        System.out.println(love);
        System.out.println(type);
    }
}
//宠物类: 老虎类和猫类都属于他的子类
class Pet{
    //猫类和老虎类共同的特征(属性和方法)
    String name;
    int health;
    int love;
    public void print(){
        System.out.println("宠物基本信息:");
        System.out.println(name);
        System.out.println(health);
        System.out.println(love);
        //父类不能使用子类的资源
        //System.out.println(color);
        //System.out.println(type);
    }
}
class TestPet{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="花花";
        c.health=100;
        c.love=60;
        c.color="菊花";
        c.print();

        Tiger t=new Tiger();
        t.name="小王";
        t.health=100;
        t.love=70;
        t.type="东北虎";
        //调用哪个方法 需要t对象指向的是谁
        t.print();
    }
}
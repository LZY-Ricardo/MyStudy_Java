package day5;
//宠物类
public abstract class Pet extends Animal1 {
    String name;
    int love=60;//友好度
    int health=100;//健康度
    //方法不能删除  也不能方法实现(因为都用的是子类重写的方法)
    //可以将方法设置成抽象方法(只有方法的声明 没有方法实现)
    public abstract void print();
    //测试访问修饰符不能严于父类
    protected void test1(){

    }
    //测试返回值可以是其子类
    public Paraent test2(){
        return null;
    }
}
class Paraent{}
class Child1 extends Paraent{}
class Child2 extends Paraent{}

//动物类
class Animal{
    int year;
}
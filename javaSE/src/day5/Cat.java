package day5;

public class Cat extends Pet{
    String color;//颜色   猫自己独有的属性
    public void print(){
        System.out.println("打印宠物的信息");
        System.out.println("姓名:"+name);
        System.out.println("友好度:"+love);
        System.out.println("健康值:"+health);
        System.out.println("颜色:"+color);
    }
}
class Penguin extends Pet{
    String sex;//性别 企鹅自己独有的属性
    //ctrl+o    快捷重写父类方法
    @Override   //表示方法重写的注解,可选的
    public void print() {

    }
}

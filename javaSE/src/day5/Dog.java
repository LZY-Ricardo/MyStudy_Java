package day5;

public class Dog extends Pet{
    String type;//狗类独有的属性   品种
    //重写父类的方法 可以体现自己独有的特性
    public void print() {
        System.out.println("打印宠物的信息");
        System.out.println("姓名:" + name);
        System.out.println("健康值:" + health);
        System.out.println("友好度:" + love);
        System.out.println("品种:"+type);
    }
    //子类重写父类的方法 父类修饰符   protected
    //子类 可以写protected 和public
    public void test1(){

    }
    //Child1属于Paraent子类
    //子类重写时 可以写他的子类做返回值
    public Child1 test2(){
        return null;
    }
}

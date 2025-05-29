package day3;

public class Dog {
    //静态特征:属性   名称  品种  颜色
    //属性    也叫成员变量
    //访问修饰符 类型  名称;
    public String name;
    protected String type;
              String color;
    //动态特征:方法   吃饭  拆家
    public void eat(String msg){    //形式参数
        //局部变量
        String name="小网红";
        for (int i=0;i<10;i++){

        }
        if(true){
            String str="123";
        }
        System.out.println("局部:"+name+" "+type+"小狗开始吃:"+msg);
        //this 当前类的对象   this.name    一定是访问成员变量
        System.out.println("成员:"+this.name);
    }
    //拆家
    public void spilt(){
        System.out.println(name+"小狗开始拆家");
    }
    public static void main(String[] args) {
//        int[] nums=new int[5];
//        Dog d=new Dog();
//        System.out.println(nums);
//        System.out.println(d);
        String s=null;
        //1.创建对象
        Dog dog = new Dog();
        //2.对象.属性名 来使用属性
        dog.name="花花";
        dog.type="金毛";
        dog.color="黄色";
        //3.对象.方法
        dog.eat("排骨");
        dog.spilt();
    }
}

package day7;
//测试接口的特点
//4.接口和接口之间 支持多继承
public interface TestInterface extends TestInterface2,TestInterface3{
    //1.属性只能是常量 默认修饰符 public static final
     String name="易聪";
   public static final String sex="男";

   //2.方法都是抽象方法 默认修饰符  public abstract
    public void method();
    public abstract void method2();
    void method3();

    //3.不能有构造方法
//    public TestInterface(){
//    }
    //5.jdk1.8  接口 支持静态方法 和默认方法
    public default void method4(){

    }
    public static void main(String[] args) {

    }
}
interface TestInterface2{}
interface TestInterface3{}
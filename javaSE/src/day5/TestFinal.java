package day5;
//测试final修饰符
public final class TestFinal {
    public final void testMethod(){
    }
    //final修饰属性是常量 必须先赋值 一旦赋值不能修改
    final String sex="男";
    //final修饰属性 如果我不想直接赋值 怎么解决
    final static double pai;
    static{
        pai=3.1415926;
    }
//    public TestFinal(){
//        pai=3.14;
//    }
}
//final修饰的类不能被继承
//class Child extends TestFinal{
//    @Override
//    public void testMethod(){
//    }
//}
class MyError extends Error{
    public void test(){
        System.out.println(Math.PI);
        //int 封装类
        int i=10;
        Integer i2=10;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}

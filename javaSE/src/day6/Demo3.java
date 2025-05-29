package day6;
//测试final修饰符
public final class Demo3 {
    //必须要先赋值  一旦赋值不能改变
    final String sex="男";
    final static double pi;
    final int status;
    static{
        pi=3.14;
    }
    public Demo3(){
        status=10;
    }
    final void test1(){

    }
}
//class Child extends Demo3{
//    void test1(){
//
//    }
//}

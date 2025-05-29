package day6;

public class Test{
    static{
        System.out.println("静态");
    }
    {
        System.out.println("构造");
    }
    public void test(){
        {
            System.out.println("普通");
        }
    }
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        t1.test();
        t2.test();
        t1.test();


    }
}
class TestDemo{
    public static void main(String[] args) {

    }
}
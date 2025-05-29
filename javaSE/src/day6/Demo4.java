package day6;
//测试重载 overload
public class Demo4 extends Parent{
    public int happy(int a){
        return 0;
    }
    public void happy(String a,int b){

    }
    public void happy(int a,String b){

    }
    //@Override
    public static void test(){

    }
}
class Parent{
    public static void test(){

    }
    public void happy(){

    }
    public static void main(String[] args) {
        Demo4 d=new Demo4();
        d.happy();
        d.happy(10);
    }
}
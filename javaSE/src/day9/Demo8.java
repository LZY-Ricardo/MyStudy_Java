package day9;
//测试打印异常信息
public class Demo8 {
    static int num1=10;
    static int num2;
    public static void main(String[] args) {
        one();
    }
    public static void one(){
        two();
    }
    public static void two(){
        try{
            int result1=num1+num2;
            int result2=num1/num2;
        }catch(Exception e){
            //异常堆栈信息
            e.printStackTrace();
            //获取异常基本信息
            String msg=e.getMessage();
            System.out.println(msg);
            //打印错误信息
            System.err.println("我出现了错误");
        }finally{

        }

    }
}

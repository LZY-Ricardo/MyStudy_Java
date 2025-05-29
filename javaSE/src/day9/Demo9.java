package day9;

public class Demo9 {
    public static void main(String[] args){
        int i=test2();
        System.out.println(i);
    }
    public static int test1(){
        int a=10;
        try{
            System.out.println("执行了try");
            int b=a/10;
            return 10;
        }catch (Exception e){
            System.out.println("执行了catch");
            return 20;
        }finally{
            System.out.println("执行了finally");
            return 30;
        }
    }
    public static int test2(){
        int a=10;
        try{
            System.out.println("执行了try");
            int b=a/10;
            //先return 但是不会立即返回
            //而是会保存一个临时副本
            //再看finally是否有return
            //如果有 则替换之前的临时副本来返回
            //如果没有 则返回临时副本
            return a;
        }catch (Exception e){
            System.out.println("执行了catch");
            return 20;
        }finally{
            a+=20;
            System.out.println("执行了finally");
            return a;
        }
    }
}

package day13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//通过Callable来实现线程
//实现Callable接口 实现call()
public class TestCallable implements Callable<Integer> {
    //public void run(){}
    @Override
    public Integer call() throws Exception {
        String name=Thread.currentThread().getName();
        Integer  sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
            Thread.sleep(300);
            System.out.println(name+" "+sum);
        }
        System.out.println(name+"执行完毕");
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable call=new TestCallable();
        //Callable想让Thread运行需要第三方对象
        FutureTask<Integer> ft=new FutureTask(call);
        Thread t1=new Thread(ft,"线程1");
        t1.start();
        //ft.get()可以获取Call()运行结果 而且会让线程进入阻塞状态
        //等到call()执行结束了 才会执行get()
        Integer result = ft.get();
        System.out.println("线程1的返回值是"+result);
    }
}

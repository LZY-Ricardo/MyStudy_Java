package day13;
//通过Thread类实现线程
//继承Thread 重写run()
public class TestThread extends Thread {
    //表示线程的执行逻辑
    @Override
    public void run() {
        //获取当前线程对象.获取线程名()
        String name = Thread.currentThread().getName();
        for(int i=0;i<10;i++){
            System.out.println(name+":"+i);
        }
    }

    public static void main(String[] args) {
        TestThread t=new TestThread();
        //只是 普通对象调用方法
        //t.run();
        TestThread t2=new TestThread();
        //t2.run();
        //不是线程开启的方法 相当于主线程(main) 调用两次run()
        //没有交替并发执行
        //表示线程进入就绪状态,表示可以和其他线程竞争CPU
        //竞争到了CPU就会进入运行状态 底层就会自动执行run()
        t.start();
        t2.start();
    }
}

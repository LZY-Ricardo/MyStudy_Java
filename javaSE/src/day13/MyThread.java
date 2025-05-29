package day13;
//用户线程:自定义的线程基本都是
public class MyThread extends Thread{
    //重写:方法名一样 参数一样 修饰符不能严于父类
    //返回值也可以是其子类 不能抛出比较父类更多的异常
    public void run(){
        String name=Thread.currentThread().getName();
        for(int i=0;i<10;i++){
            System.out.println(name+"=="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
//守护线程:服务用户线程的 它结束了 我也结束了
class ProtectedThread extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        while(true){
            System.out.println(name+"正在执行");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        ProtectedThread t2=new ProtectedThread();
        t1.setName("用户线程");
        t2.setName("守护线程");
        ///开启守护线程 但是必须在线程启动之前设置
        t2.setDaemon(true);
        t2.start();
        t1.start();
    }
}

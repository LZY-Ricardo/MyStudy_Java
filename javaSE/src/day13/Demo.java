package day13;

public class Demo {
    public static void main(String[] args) {
        Thread vip=new Thread(()->{
            String name=Thread.currentThread().getName();
            for(int i=1;i<=10;i++){
                System.out.println(name+"正在看第"+i+"个");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"VIP用户");
        Thread normal=new Thread(()->{
            String name=Thread.currentThread().getName();
            for(int i=1;i<=50;i++){
                System.out.println(name+"正在看第"+i+"个");
                try {
                    Thread.sleep(500);
                    if(i==10) vip.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        },"普通用户");

        vip.setPriority(Thread.MAX_PRIORITY);
        normal.setPriority(Thread.MIN_PRIORITY);

        vip.start();
        normal.start();
    }
}


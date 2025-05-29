package day13.MyHomework;

import java.time.LocalTime;

//a.通过线程 编写一个计时器，每隔一秒钟，在控制台打印出最新时间
public class Timer extends Thread{
    @Override
    public void run() {
        while(true){
            LocalTime ld= LocalTime.now();
            System.out.println(ld);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Timer t=new Timer();
        t.start();
    }
}

package day13.MyHomework;

import java.util.Random;

//b.编制一个有3个线程的程序。
//线程1模拟温度传感器，每隔500毫秒产生并输出一个20-40的随机数，用以表示当前温度。
//线程2模拟湿度传感器，每隔400毫秒产生并输出一个70-90的随机数，用以表示当前湿度。
//线程3模拟光照传感器，每隔300毫秒产生并输出一个20-80的随机数，用以表示当前光线强度
public class Sensor {
    public static void main(String[] args) {
        new Thread(()->{
            String name=Thread.currentThread().getName();
            Random r=new Random();
            while (true) {
                System.out.println(name+" "+r.nextInt(20)+20);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"温度传感器").start();
        new Thread(()->{
            String name=Thread.currentThread().getName();
            Random r=new Random();
            while (true) {
                System.out.println(name+" "+r.nextInt(20)+70);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"湿度传感器").start();
        new Thread(()->{
            String name=Thread.currentThread().getName();
            Random r=new Random();
            while (true) {
                System.out.println(name+" "+r.nextInt(60)+20);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"光照传感器").start();
    }
}

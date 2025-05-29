package day13;

public class practice {
    // 共享锁对象
    private static final Object lock = new Object();

    public static void main(String[] args) {
        normal n = new normal(lock);
        vip v = new vip(lock);

        Thread t1 = new Thread(n, "普通用户");
        Thread t2 = new Thread(v, "VIP用户");

        t1.setPriority(3);
        t2.setPriority(7);

        t2.start();
        t1.start();
    }
}

class normal implements Runnable {
    private Object lock;

    public normal(Object lock) {
        this.lock = lock;
    }

    public void run() {
        // 前10个普通用户
        for (int i = 1; i <= 10; i++) {
            System.out.println("普通用户 " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 等待 VIP 完成
        synchronized (lock) {
            System.out.println("普通用户暂停，等待 VIP 完成...");
            try {
                lock.wait(); // 当前线程进入等待状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 后40个普通用户
        for (int i = 11; i <= 50; i++) {
            System.out.println("普通用户 " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class vip implements Runnable {
    private Object lock;

    public vip(Object lock) {
        this.lock = lock;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("VIP用户 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (lock) {
            System.out.println("VIP已完成，通知普通用户继续");
            lock.notify(); // 唤醒等待中的普通用户线程
        }
    }
}

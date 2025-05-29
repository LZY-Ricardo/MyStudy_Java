package day13.MyHomework;
//b.两个人AB通过一个账号A在柜台取钱和B在ATM机取钱 总金额自定义1000元
//   A专门 在银行取钱200    B专门在ATM取钱100    直到金额不足时结束
public class TakeMoney {
    public static void main(String[] args) {
        Account account = new Account();
        TakeThread t1=new TakeThread(account,200);
        TakeThread t2=new TakeThread(account,100);
        new Thread(t1,"A").start();
        new Thread(t2,"B").start();
}
static class TakeThread implements Runnable {
        private Account account;
        private int money;
        public TakeThread(Account account,int money){
            this.account=account;
            this.money=money;
        }

    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        while(account.takeMoney(money)){
            System.out.println(name+"取钱成功");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name+"取钱失败");
    }
}
}
class Account{
    private int money=1000;
    public synchronized boolean takeMoney(int money){
        String name=Thread.currentThread().getName();
        if(this.money>=money){
            this.money-=money;
            System.out.println(name+"取钱成功"+money+" 剩余余额为"+this.money);
            return true;
        }else{
            System.out.println("余额不足,取款失败");
            return false;
        }
    }
}

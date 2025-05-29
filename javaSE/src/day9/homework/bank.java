package day9.homework;
//b.建立exception包，建立Bank类，
//类中有变量double balance表示存款,Bank类的构造方法能增加存款，
//Bank类中有取款的发方法withDrawl(double dAmount),
//当取款的数额大于存款时,抛出BalanceException
//取款数额为负数，抛出NegativeException,如new Bank(100),表示存入银行100元，
//当用方法withdrawal(150)，withdrawal(-15)时会抛出自定义异常。
//BalanceException    自定义异常   表示余额不足
//NegativeException        自定义异常   表示取款数不能为负数
public class bank {
    double balance;
    public bank(double balance){
        this.balance=balance;
    }
    //取款
    public void withDrawl(double dAmount){
        if(dAmount<0){
            try {
                throw new NagativeException("取款数不能为负数");
            } catch (NagativeException e) {
                System.err.println(e.getMessage());
            }
        }else if(balance>=dAmount){
            balance-=dAmount;
            System.out.println("取款成功,余额:"+balance);
        }else if(balance<dAmount){
            try {
                throw new BalanceException("余额不足");
            } catch (BalanceException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        bank b=new bank(1000);
        b.withDrawl(500);
        b.withDrawl(600);
        b.withDrawl(-100);
    }
}
class BalanceException extends RuntimeException{
    public BalanceException(String msg){
        super(msg);
    }
}
class NagativeException extends Exception{
    public NagativeException(String msg){
        super(msg);
    }
}
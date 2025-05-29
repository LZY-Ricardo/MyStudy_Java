package day9.exception;

public class BalanceException extends Exception{
    public BalanceException(){
        super();
    }
    public BalanceException(String msg){
        super(msg);
    }
}

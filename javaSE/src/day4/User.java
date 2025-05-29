package day4;
//this关键字
public class User {
    int id; //用户编号
    String username;//账号
    String password;//密码
    double money;//存款
    public User(){
        //必须写在构造方法第一行代码否则报错
        //切记 不要循环调用
        this(15.5);
        System.out.println("调用无参构造");
        //this(15.5); 错误的
    }
    public User(double money){
        //this();
        //给属性赋值初值
        this.money=money;
        //用法偏少
        this.setMoney(100);
        //偏多
        setMoney(200);
        System.out.println("调用1个参数构造");
    }
    public User(String username,String password){
        System.out.println("调用2个参数构造");
        this.username=username;
        this.password=password;
    }
    public User(String username,String password,double money){
        this(username,password);
        this.money=money;
        System.out.println("调用3个参数构造");
//        this.username=username;
//        this.password=password;
//        this.money=money;
    }
    //存款的方法
    public void setMoney(double money){
        this.money+=money;
    }
    //静态方法
    public static void main(String[] args) {
        //this.money  不能使用在静态方法中
        new User("admin","123",1000);
    }
}
class Test{
    public static void main(String[] args) {
        User u=new User();
        u.setMoney(15.5);
    }
}
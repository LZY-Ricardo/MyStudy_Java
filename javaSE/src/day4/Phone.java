package day4;
//手机类: 进行封装
//型号(IOS,安卓,鸿蒙)  颜色  价格(0-5000)
//1.属性私有化(不让其他类随便使用我的属性)
//2.对外提供get 和 set获取和设置属性(用户可以再set和get设置自己属性规则)
public class Phone {
    private String type;
    private String color;
    private double money;
    //设置手机型号的方法 setType 一般是需要带参数
    public void setType(String type){ //null
        if("IOS".equals(type) ||
                "安卓".equals(type) ||
                "鸿蒙".equals(type)){
            this.type=type;
        }else{
            System.out.println("你输入手机型号不合法，默认值:安卓");
            this.type="安卓";
        }
    }
    //获取手机型号的方法 getType 一般是带返回值
    public String getType(){
        return this.type;
    }
    //设置获取颜色(银色和黑色)  设置获取价格(0-5000)
    //alt+insert(ins)  快捷生成 构造  get  set ...
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if("银色".equals(color)||"黑色".equals(color)){
            this.color=color;
        }else{
            System.out.println("颜色有误,默认黑色");
            this.color="黑色";
        }
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        if(money>0 && money<5000){
            this.money=money;
        }else{
            System.out.println("价格不亲民,默认1000");
            this.money=1000;
        }
    }
}
class TestPhone{
    public static void main(String[] args) {
        Phone p=new Phone();
        p.setType("鸿蒙");
        p.setColor("银色");
        p.setMoney(3000);
        System.out.println(p.getColor());
        System.out.println(p.getType());
        System.out.println(p.getMoney());
        System.out.println("--------------");
        Phone p2=new Phone();
        p2.setType(null);
        p2.setColor("绿色");
        p2.setMoney(-5000);
        System.out.println(p2.getType());
        System.out.println(p2.getColor());
        System.out.println(p2.getMoney());
    }
}

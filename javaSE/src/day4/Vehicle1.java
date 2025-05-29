package day4;
//2.请定义一个交通工具(Vehicle)的类其中有:
//属性： 速度(speed)、 体积(size)等，
//方法：移动(move())、设置速度(setSpeed(int speed))、加速 speedUp()、减速 speedDown()等。
//最后在测试类 Vehicle 中的 main()中实例化一个交通工具对象并通过方法给它初始化
//    speed,size 的值并且通过打印出来。另外调用加速、减速的方法对速度进行改变
public class Vehicle1 {
    int speed;
    int size;
    public void move() {
        System.out.println("开始移动");
    }
    public void setSpeed(int speed){
        if(speed>0 && speed<200){
            this.speed = speed;
        }else{
            this.speed=50;
        }
    }
    public void speedUp(){
        if(speed+10<200){
            this.speed+=10;
            System.out.println("加速了10公里/小时,目前车速:"+this.speed);
        }else{
            System.out.println("加速了"+(200-speed)+"公里/小时，目前车速："+200);
            this.speed=200;
        }
    }
    public void speedDown(){
        if(speed-10<200){
            this.speed-=10;
            System.out.println("减速了10公里/小时,目前车速:"+this.speed);
        }else{
            this.speed=0;
            System.out.println("减速了"+(speed)+"公里/小时，目前车速："+0);
        }
    }

    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1();
        v.setSpeed(175);
        v.speedUp();
        v.speedUp();
        v.speedUp();


    }
}

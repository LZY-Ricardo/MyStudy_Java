package day5;

public class One {
    public One(){
        System.out.println("One类无参构造");
    }
}
class Two extends One{
    public Two(int a){
        System.out.println("Two有参构造");
    }
    //public Two(){}
}
class Three extends Two {
    public Three(){
        //super(); 默认调用父类无参构造
        super(10);//调用父类有参构造  默认super()失效
        System.out.println("Three类无参构造");
    }

    public static void main(String[] args) {
        new Three();//Two//One
    }
}

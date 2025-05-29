package day7;

public class Demo {
    @Override
    public String toString() {
        return "我是一个对象";
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        //默认打印 使用的是Object类的toString()
        System.out.println(d);//地址   子类自己重写后toString
        String s=new String("java");
        String s2="java";
        //String 重写了toString()
        System.out.println(s);  //数据
        System.out.println(s2); //数据

        //final char[]{'j','a','v','a'} 属于常量
        //存储再常量池(保存常量的)的
        //比如:线程池 连接池 都是一样的原理
        //都是为了提高效率, 线程池里面先保存很多个线程
        //你需要使用 只直接获取  无用自己创建
        //节约你创建线程的时间   以空间换时间的方式 提高效率
        String str="java"; //str指向常量池中的地址
        String str2=new String("java");//str2指向堆内存
        String str3=new String("java");//str3指向堆内存
        System.out.println(str==str2);//判断地址 false
        System.out.println(str3==str2);//判断地址 false

        //面试题: 创建了几个对象
        //答案: 1个或者2个 new String会再堆内存创建一个
        //同时还要看常量池中 是否存在abcd常量,如果不存在在
        //才需要创建一个常量
        String s3=new String("abcd");
    }
}

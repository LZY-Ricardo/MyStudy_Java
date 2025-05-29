package day12;

import java.util.Random;

//b.创建一个球员类，并且该类最多只允许创建十一个对象。提示利用 static 和 封装性来完成。
public class Homework2 {
    private static Homework2[] objs=new Homework2[11];
    static {//初始化11个对象
        for(int i=0;i<objs.length;i++){
            objs[i]=new Homework2();
        }
    }
    private Homework2(){}
    public static Homework2 get(){
        Random r=new Random();
        int index=r.nextInt(11);
        return objs[index];
    }
}
//通过静态内部类 实现单例模式的原理来完成11个对象的创建
class Homework3{
    private Homework3(){}
    private static class Input{
        private static Homework3[] objs=new Homework3[11];
        static {
            for(int i=0;i<objs.length;i++){
                objs[i]=new Homework3();
            }
        }
    }
    public static Homework3 get(){
        return Input.objs[new Random().nextInt(11)];
    }
}
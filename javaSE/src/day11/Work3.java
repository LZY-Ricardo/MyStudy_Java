package day11;

import java.util.LinkedList;

//a.自定义一个类使用LinkedList模拟一个堆栈或者队列数据结构
//堆栈：先进后出
//队列：先进先出
//泛型的使用方式 类上面定义的泛型:会根据实例化对象
//指定的类型来决定 比如:Work3<Integer> w=null;
//A类型就是Integer类型
public class Work3<A> {
    private LinkedList<A> list = new LinkedList<>();
    //存储的方法
    public void add(A a){
        list.addFirst(a);
    }
    //获取的方法
    public A get(){
        //模拟队列先进先出
        //要获取最后一个元素还要删除最后元素
        //A a=list.getLast();
        //并且remove() 删除元素还会把删除的元素返回
        //return list.removeLast();
        //模拟栈先进后出
        //获取头元素 还要删除头元素即可
        return list.removeFirst();
    }
    //判断集合是否为空的方法
    public boolean isEmpty(){
        return list.isEmpty();
    }

    public static void main(String[] args) {
        Work3<String> w=new Work3<>();
        w.add("AAA");
        w.add("BBB");
        w.add("CCC");
        w.add("DDD");
        while(!w.isEmpty()){
            System.out.println(w.get());
        }
    }
}

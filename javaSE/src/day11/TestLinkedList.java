package day11;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

//测试LinkedList
public class TestLinkedList {
    @Test
    public void test(){
        List<Integer> list = new LinkedList<>();
        //list.常用方法() 正确的
        list.add(100);
        list.add(200);
        list.add(300);
        list.remove(1);
        //但是不可以使用独有的方法
        LinkedList<Integer> list2=(LinkedList)list;
        list2.addFirst(50);
        list2.addFirst(10);

        list2.removeLast();//删除最后一个
        System.out.println(list2);//10 50 100
        //后期 可以利用LinkedList链表的特点
        //来模拟不同的数据结构
        //比如:队列 先进先出(先存储的数据 最先获取出来
        //比如:栈   先进后出(先存储的数据 最后获取出来)
        //方法的调用过程 底层实现就是栈 先进后出
        a();    //a->b->c 结束 c结束->b结束->a结束
    }
    public void a(){
        b();
    }
    public void b(){
        c();
    }
    public void c(){
        System.out.println("c");
    }
}

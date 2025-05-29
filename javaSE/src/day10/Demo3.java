package day10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//测试集合ArrayList集合
public class Demo3 {
    @Test
    public void test1() {
        List list = new ArrayList();
        //List list2=new LinkedList();
        list.add(100);
        list.add(1000);
        list.add(10000);
        list.add("java");
        list.add(true);
        list.add(new Demo3());
        //修改
        list.set(2, false);
        //删除
        list.remove(3);
        //删除整型数据 推荐使用根据下标删除
        //list.remove(100);

        //根据下标获取一个值
        //如何元素特别多 推荐通过遍历集合来获取
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("通过标准for循环做遍历");
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
        System.out.println("通过增强for循环做遍历");
        //数据类型:表示集合里面元素的类型
        //临时变量:每次循环遍历出来集合里面的元素
        //语法:for(数据类型 临时变量:集合或数组){}
        //并且增强for底层原理是迭代器实现的
        for(Object i:list){
            System.out.println(i);
        }
        System.out.println("通过迭代器做遍历");
        //1.通过集合获取迭代器对象(目的将集合的元素存储到迭代器)
        //2.通过while()循环 每次循环一次 通过迭代器获取第一个元素
        //然后 再删除以一个 下一个元素就变成第一个元素
        Iterator it=list.iterator();
        //it如果还有元素的时候 才需要遍历
        while(it.hasNext()){
            Object o=it.next();
            System.out.println(o);
        }
    }
}

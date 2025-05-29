package day11;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//测试HashSet
public class TestSet {
    @Test
    public void test(){
        Set<String> set=new HashSet<>();
        //相比list 常用方法中 没有下标的方法
        set.add("java");
        set.add("mysql");
        set.add("java");
        set.add("spring");
        set.add("vue");

        set.remove("mysql");
        //set没有get()方法 无法单独获取一个元素
        //只能通过遍历(只有增强for 和迭代器)
        for(String s:set){
            System.out.println(s);
        }
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        //不能通过标准for遍历
        for(int i=0;i<set.size();i++){
            //set.get(i);
        }
    }
}

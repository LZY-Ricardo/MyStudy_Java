package day11;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//测试集合泛型
public class TestGenerics {
    List<String> list;
    @Before
    public void test(){
        list = new ArrayList();
        list.add("java");
        list.add("mysql");
        list.add("jdbc");
        list.add("tomcat");
    }
    @Test
    public void iterator1(){
        System.out.println("增强for遍历");
        for(String s:list){
            System.out.println(s);
        }
    }
    @Test
    public void iterator2(){
        System.out.println("迭代器遍历");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}

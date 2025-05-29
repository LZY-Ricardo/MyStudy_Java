package day11;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

//测试TreeSet
public class TestTreeSet {
    @Test
    public void test(){
        Set<Integer> set1=new TreeSet<>();
        Set<String> set2=new TreeSet<>();
        set1.add(10);
        set1.add(65);
        set1.add(5);
        set1.add(9);
        set1.add(30);
        //底层是红黑树 这个是由顺序的 添加好了
        //红黑树就会按照升序来保存 元素重复了默认去重
        //8-8=0 认为相同
        System.out.println(set1);
        set2.add("java");
        set2.add("jdbc");
        set2.add("mysql");
        set2.add("jdbc");
        set2.add("java");
        //"jdbc".compareTo("jdbc")==0
        //TreeSet就会认为是相同的
        //元素重复了默认去重 并排序
        System.out.println(set2);
        Set<Emp> set3=new TreeSet<>((e1,e2)->
                (int)(e2.sal-e1.sal)
        );
        //为什么少个对象 TreeSet底层不是根据元素去重
        //而是根据排序规则 =0 去重的
        set3.add(new Emp(1,"张三",1000));
        set3.add(new Emp(2,"李四",2000));
        set3.add(new Emp(3,"王五",2000));
        set3.add(new Emp(4,"赵六",4000));
        System.out.println(set3);

        //定义扑克牌(♣10 ♠10 ♦K ♥J ♥A ♦3 ......)
        //让你按照 整理牌的顺序 对这个数据进行排序
        //规则:相同的在一起 2最大 3最小 ...


    }
}


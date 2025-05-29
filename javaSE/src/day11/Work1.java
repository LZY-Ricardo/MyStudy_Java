package day11;

import org.junit.Test;

import java.util.*;


//面试题考的
//a.定义两个集合，合并成一个集合 要求不能有重复的元素
//定义第三个集合 遍历前两个集合 判断集合中是否存在
//利用集合预算 利用list转换set去重
//利用集合运算 先做差集 再做并集
public class Work1 {
    @Test
    public void test1(){
        String[] arrayA={"1","2","3","4"};
        String[] arrayB={"3","4","5","6"};
        List<String> listA=new ArrayList<>(Arrays.asList(arrayA));
        List<String> listB=new ArrayList<>(Arrays.asList(arrayB));
        //1.先并集 但是有重复
        listA.addAll(listB);
        //2.利用set集合封装一下(list转换set)
        Set<String> set=new HashSet<>(listA);
        System.out.println(set);
    }
    @Test
    public void test2(){
        String[] arrayA={"1","2","3","4"};
        String[] arrayB={"3","4","5","6"};
        List<String> listA=new ArrayList<>(Arrays.asList(arrayA));
        List<String> listB=new ArrayList<>(Arrays.asList(arrayB));
        //1.先做差集
        listA.removeAll(listB); //1 2
        //2.再做并集
        listA.addAll(listB);
        //缺点:如果listA 和 listB 自己有重复的元素没有办法
        //解决方案:封装set集合
        System.out.println(listA);
    }
}

package day11;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//测试集合排序
public class TestSort {
    List<Integer> list1=new ArrayList<>();
    List<String> list2=new ArrayList<>();
    List<Emp> list3=new ArrayList<>();
    @Before
    public void Before(){
        Integer[] nums={1,7,9,2,3,6,7,1,-6};
        String[] strs={"adf","bads","csda","dsadd","fdfe","ffsa"};
        Emp[] emps={
                new Emp(1,"张三",3000),
                new Emp(2,"李四",6000),
                new Emp(3,"王五",4000),
                new Emp(4,"赵六",6000),
                new Emp(5,"钱七",7000),
        };
        //都是不可变集合
        list1= Arrays.asList(nums);
        list2=Arrays.asList(strs);
        list3=Arrays.asList(emps);
    }
    @Test
    public void test(){
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println("排序后:");
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);
        //默认是不可以针对于 对象来排序 : 因为没有告诉它
        //根据什么属性排序
        //Collections.sort(list3);
    }
    @Test
    public void test2(){
        //对象 先根据工资降序排序 工资相同 根据员工编号升序
        Collections.sort(list3,(e1,e2)->{
            int result=(int)(e2.sal-e1.sal);
            if(result==0){
                result=e1.id-e2.id;
            }
            return result;
        });
        System.out.println(list3);
    }
}
class Emp {
    Integer id;
    String name;
    double sal;

    public Emp(Integer id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
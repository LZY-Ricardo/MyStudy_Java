package day6;

import java.util.Arrays;
import java.util.Comparator;

//测试数据工具类 排序
public class Demo1 {
    public static void main(String[] args) {
        test2();
    }
    public static void test1(){
        int[] array1={8,7,8,6,4,-9,20};
        double[] array2={15.5,95.5,-45.5,100};
        String[] array3={"java","abc","aaa","mysql"};
        Arrays.sort(array1);
        Arrays.sort(array2);
        Arrays.sort(array3);
        //直接打印数组 打印的是数组在堆内存中保存的地址
        System.out.println(array1);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
    //实现 对象 数组排序
    public static void test2(){
        Emp[] emps={
                new Emp(10,"张三1",8000),
                new Emp(30,"张三2",8000),
                new Emp(20,"张三3",6000),
                new Emp(50,"张三4",9000),
                new Emp(40,"张三5",9000)
        };
        //比较器对象: 告诉数组按照对象什么属性排序
        //Comparator 属于外部比较器对象
        Comparator c=new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        //lambda表达式: (方法参数)-> {方法实现}
        //<>属于泛型 告诉Comparator里面存储的数据是Emp类型
        //比较器是根据返回值int来 决定先后顺序的 如果=0相等
        //如果大于0  O1>O2 ...
        //想按照员工的工资降序排序
        Comparator<Emp> c2=(o1,o2)->{
            int i=(int)(o2.sal-o1.sal);
            return i;
        };
        //想先按照工资降序排序 如果工资相同 再按照id升序排序略
        Comparator<Emp> c3=(o1,o2)->{
            int i=(int)(o2.sal-o1.sal);
            //i==0 说明工资相同
            if(i==0) i=o1.id -o2.id;
            return i;
        };
        Arrays.sort(emps,c3);
        for(Emp e:emps){
            System.out.println(e);
            System.out.println(e.id+" "+e.name+" "+e.sal);
        }

    }
}
class Emp{
    int id;
    String name;
    double sal;
    //alt+insert
    public Emp(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    //重写Object类的toString
    //打印对象 之前是地址  现在打印就是重写toString后的返回值
    public String toString() {
        return "呵呵";
    }
}

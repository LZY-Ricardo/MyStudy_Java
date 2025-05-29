package day10;

import org.junit.Test;

import java.util.*;

public class Homework {
    //a.求一个5*5矩阵两条对角线元素之和
    //程序分析：利用双重for循环控制输入二维数组,再将a[i][j]累加后输出。
    //1  2  3  4   5
    //6  7  8  9  10
    //11 12 13 14 15
    //16 17 18 19 20
    //21 22 23 24 25
    @Test
    public void test1(){
        int n=5;
        int[][] nums=new int[n][n];
        int num=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=num++;
                //累加了第一和第二条对角线
                if(i==j || (i+j==n-1 && i!=j)) sum+=nums[i][j];
                //累加了第二条对角线(排除重复的元素)
                //if(i+j==n-1 && i!=j) sum+=nums[i][j];
            }
        }
        System.out.println("总和:"+sum);
    }
    //b.有一个User对象(id,name,info对象)  ,
    // info对象(id,sex,age)  通过深克隆的方式
    //克隆User对象
    @Test
    public void test2() throws CloneNotSupportedException {
        User u=new User();
        u.id=10;
        u.name="彭正";
        u.info=new Info();
        u.info.id=u.id;
        u.info.sex="男";
        u.info.age=18;

        System.out.println("克隆前:"+u+"  "+u.info);
        u=u.clone();
        System.out.println("克隆后:"+u+"  "+u.info);
    }
    //a.定义ArrayList集合,存入如下字符串：“abc",“123",“java",“mysql",“别跑啊"
    //   遍历集合,将长度小于4的元素左边填充字符串0,并在控制台打印输出修改后集合中所有元素
    //**输出结果格式： ** [0abc,0123,java,mysql,0别跑啊]
    @Test
    public void test3(){
//        List list=new ArrayList();
//        list.add("abc");
//        list.add("abc");
        String[] strs={"a","12","java","mysql","别跑啊"};
        //底层是会创建一个不可变集合(可以查看不能修改)
        List list=Arrays.asList(strs);
        System.out.println(list.get(1));
        //list.add(100);  //不允许
        //list.remove(0); //不允许
        //list.set(1,"aaa");//可以 长度没有变
        for(int i=0;i<list.size();i++){
            while(((String)list.get(i)).length()<4){
                list.set(i,"0"+list.get(i));
            }
        }
        System.out.println(list);
    }
    //b.定义一个User2类  属性: id  name  age
    //定义一个List存储10个User2对象  数据可以 自行添加
    //通过迭代器的方式遍历出来集合的每个元素
    //中的id  name 和age属性
    @Test
    public void test4(){
        List list=new ArrayList();
        for(int i=1;i<=10;i++) {
            list.add(new User(i, "张三:"+i, 18+i));
        }
        //1.创建迭代器对象
        Iterator it=list.iterator();
        //2.通过hasNext()判断是否有下一个  next() 获取下一个
        while(it.hasNext()){
            Object o=it.next();
            System.out.println(o);
        }
        Map m=new HashMap<>();
//        m.iterator();
//        for(Object o:m){
//
//        }
    }
}
class User implements Cloneable{
    Integer id;
    String name;
    Integer age;
    public String toString(){
        return id+" "+name+" "+age;
    }
    public User() {
    }

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    Info info;
    protected User clone() throws CloneNotSupportedException {
        User u=(User)super.clone();
        u.info=(Info)u.info.clone();
        return u;
    }
}
class Info implements Cloneable{
    Integer id;
    String sex;
    Integer age;
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

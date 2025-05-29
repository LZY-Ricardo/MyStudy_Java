package day11.myHomework;
import org.junit.Test;

import java.util.*;


public class homework {
    //面试题考的
    //a.定义两个集合，合并成一个集合 要求不能有重复的元素
    //定义第三个集合 遍历前两个集合 判断集合中是否存在
    //利用集合预算 利用list转换set去重
    //利用集合运算 先做差集 再做并集
    @Test
    public void test(){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        System.out.println(set1);
        set2.add(20);
        set2.add(30);
        set2.add(40);
        System.out.println(set2);
        set1.addAll(set2);
        System.out.println(set1);
    }
    //b.某班有 40 个学生，学号为 180201-180240，
    // 全部参加 Java 集合阶段检测，给出所有同学的成绩
    // （可随机产生，范围为 50-100），请编写程序将本班
    //各位同学成绩从高往低排序打印输出，
    // 注：成绩相同时学号较小的优先打印
    //要求：打印的信息包含学号、姓名和成绩 。
    @Test
    public void test2(){
        Random random = new Random();
        List<student> list=new ArrayList<>();
        for(int i=180201;i<=180240;i++){
            int score=random.nextInt(50)+50;
            list.add(new student(i,"学生"+i,score));
        }
        Collections.sort(list,(s1,s2)->{
            if(s1.score==s2.score){
                return s1.id-s2.id;
            }else{
                return s2.score-s1.score;
            }
        });
        for(student s:list){
            System.out.println(s);
        }
    }
    //a.自定义一个类使用LinkedList模拟一个堆栈或者队列数据结构
    //堆栈：先进后出
    //队列：先进先出
    @Test
    public void test3(){
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("堆栈："+s);
        s.pop();
        System.out.println(s);
        queue q=new queue();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println("队列："+q);
        q.pop();
        System.out.println(q);
    }
}
class student{
    Integer id;
    String name;
    Integer score;
    public student(Integer id, String name, Integer score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString() {
        return "student [id=" + id + ", name=" + name + ", score=" + score + "]";
    }
}
class stack{
    LinkedList<Integer> list=new LinkedList<>();
    public void push(Integer i){
        list.add(i);
    }
    public void pop(){
        list.removeLast();
    }
    public String toString(){
        return list.toString();
    }
}
class queue{
    LinkedList<Integer> list=new LinkedList<>();
    public void push(Integer i){
        list.add(i);
    }
    public void pop(){
        list.removeFirst();
    }
    public String toString(){
        return list.toString();
    }
}

package day10.MyHomework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//b.定义一个User2类  属性: id  name  age
//   定义一个List存储10个User2对象  数据可以 自行添加
//   通过迭代器的方式遍历出来集合的每个元素 中的id  name 和age属性
public class User2 {
    public int id;
    public String name;
    public int age;

    public static void main(String[] args) {
        List<User2> list = new ArrayList();
        for(int i=0;i<10;i++){
            User2 user2= new User2();
            user2.id = i;
            user2.name = "user"+i;
            user2.age = 18+i;
            list.add(user2);
        }
        Iterator itor=list.iterator();
        while(itor.hasNext()){
            User2 user2=(User2)itor.next();
            System.out.println("-----------------------------");
            System.out.println("id:"+user2.id+" name:"+user2.name+" age:"+user2.age);
        }
        System.out.println("-----------------------------");
    }
}

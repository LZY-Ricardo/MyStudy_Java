package day13;

import java.util.HashSet;
import java.util.Set;

//实现 观察者模式:
//属于观察者的抽象类
public abstract class AbstractObserver {
    String name;//观察者对象的姓名
    //更新方法 如果一的一方数据更新了
    //这些观察者对象也要更新数据
    public abstract void update(String msg);
}
//观察者对象具体实现类
class Person extends AbstractObserver{
    public Person(String name){
        super.name=name;
    }
    @Override
    public void update(String msg) {
        System.out.println(name+" "+
                "观察者猫的状态发生改变,收到新通知"+msg);
    }
}
//定义猫的主题
interface CatTopic{
    void add(AbstractObserver os);//添加关注
    void remove(AbstractObserver os);//取消关注
    //猫更新状态的方法 还要负责将关注的人也收到通知
    void update(String msg);
}
//猫对象
class Cat implements CatTopic{
    //定义观察者的集合 保存关注了猫对象的人
    Set<AbstractObserver> set=new HashSet<>();
    @Override
    public void add(AbstractObserver os) {
        set.add(os);
        System.out.println(os.name+"添加关注");
    }

    @Override
    public void remove(AbstractObserver os) {
        set.remove(os);
        System.out.println(os.name+"取消关注");
    }

    @Override
    public void update(String msg) {
        System.out.println("猫的状态改变了："+msg);
        //同时还要给关注的人 发送通知
        for(AbstractObserver os:set){
            os.update(msg);
        }
    }
}
class TestObserver{
    public static void main(String[] args) {
        //定义一的一方
        CatTopic cat=new Cat();
        //定义多的一方
        AbstractObserver user1=new Person("张三");
        AbstractObserver user2=new Person("李四");
        AbstractObserver user3=new Person("王五");
        //添加关注 用于建立依赖关系
        cat.add(user1);
        cat.add(user2);
        cat.add(user3);
        //更新状态 多的一方也会有通知
        cat.update("我饿了");
        //取消关注 取消依赖关系
        cat.remove(user3);
        //更新状态
        cat.update("我饿死了");
    }
}
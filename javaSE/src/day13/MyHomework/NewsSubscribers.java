package day13.MyHomework;

import java.util.HashSet;
import java.util.Set;

//a.正在开发一个新闻发布系统，其中有多个新闻订阅者，它们希望在新的新闻发布时及时收到通知。
// 你希望使用观察者模式实现这个新闻发布系统。
//要求：使用观察者模式设计一个 NewsPublisher 类，该类负责管理新闻订阅者并在有新新闻发布时通知它们
public abstract class NewsSubscribers {
    String name;
    abstract void update(String msg);
}
class people extends NewsSubscribers{
    public people(String name){
        super.name=name;
    }

    @Override
    void update(String msg) {
        System.out.println("新闻订阅者"+name+"收到新闻:"+msg);
    }
}
interface PressReleaseSystem{
    void add(NewsSubscribers ns);
    void remove(NewsSubscribers ns);
    void notice(String msg);
}
class PressRelease implements PressReleaseSystem{
    Set<NewsSubscribers> set=new HashSet<>();
    @Override
    public void add(NewsSubscribers ns) {
        set.add(ns);
        System.out.println(ns.name+"订阅新闻");
    }

    @Override
    public void remove(NewsSubscribers ns) {
        set.remove(ns);
        System.out.println(ns.name+"取消订阅");
    }

    @Override
    public void notice(String msg) {
        System.out.println("新闻发布系统正在发布新闻:"+msg);
        for (NewsSubscribers newsSubscribers : set) {
            newsSubscribers.update(msg);
        }
    }

    public static void main(String[] args) {
        PressRelease pr=new PressRelease();
        NewsSubscribers ns1=new people("张三");
        NewsSubscribers ns2=new people("李四");
        NewsSubscribers ns3=new people("王五");
        pr.add(ns1);
        pr.add(ns2);
        pr.add(ns3);
        pr.notice("今天是个好日子");
        pr.remove(ns3);
        pr.notice("今天是个坏日子");
    }
}

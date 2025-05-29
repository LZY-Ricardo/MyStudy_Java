package day12;
//a.你正在设计一个数据库连接池，该连接池需要确保在整个应用程序中只有一个唯一的实例。
//这是为了避免频繁创建和销毁数据库连接，提高系统性能。
//要求：使用单例模式确保数据库连接池在应用程序中只有一个实例，且能够懒加载
public class ConnectionPool {
    private static ConnectionPool p;
    private  ConnectionPool(){}
    public static ConnectionPool get(){
        if(p==null){
            //可能同时进入if 张三 李四
            synchronized (ConnectionPool.class){
                if(p==null) p=new ConnectionPool();
            }
        }
        return p;
    }
}

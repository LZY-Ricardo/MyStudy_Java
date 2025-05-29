package day12.MyHomework;
//a.你正在设计一个数据库连接池，该连接池需要确保在整个应用程序中只有一个唯一的实例。
// 这是为了避免频繁创建和销毁数据库连接，提高系统性能。
//要求：使用单例模式确保数据库连接池在应用程序中只有一个实例，且能够懒加载
public class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;
    private DatabaseConnectionPool(){}
    public static DatabaseConnectionPool getInstance(){
        if(instance==null){
            synchronized (DatabaseConnectionPool.class){
                if(instance==null){
                    instance=new DatabaseConnectionPool();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DatabaseConnectionPool pool1=DatabaseConnectionPool.getInstance();
        DatabaseConnectionPool pool2=DatabaseConnectionPool.getInstance();
        System.out.println(pool1);
        System.out.println(pool2);
    }
}

package day4;
//方法重载
public class Dog {
    //重载:一个类中 方法名相同  参数不同 返回值无关
    public void play(){
    }
    public int play(String msg){
        return 0;
    }
    //还可以传递可变长的参数 语法: 类型 ... 参数名
    //以后 传递 0-多个参数 都可以通过可变长参数来处理
    //形成一个数组参数
    public void play(String ... s){
        for(String args: s){
            System.out.println(args);
        }
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.play();
        d.play("aaa");
        d.play("a","b","c","d");
        //jdbc 肯定要关闭资源  但是资源如果不确定 就可以通过可变长参数处理
        //close(ResultSet,PreparedStatement,Connection)
        //close(PreparedStatement,Connection)
    }
}

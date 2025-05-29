package day12.MyHomework;
//b.创建一个球员类，并且该类最多只允许创建十一个对象。提示利用 static 和 封装性来完成。
public class Player {
    private static int count=1;
    private Player(){};
    public static Player getPlayer(){
        if(count<=11){
            System.out.println("成功创建第"+count+"个球员");
            count++;
            return new Player();
        }else{
            System.out.println("超过11个");
            return null;
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<15;i++){
            Player.getPlayer();
        }
    }
}

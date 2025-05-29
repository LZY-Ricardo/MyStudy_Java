package day11;

import org.junit.Test;

import java.util.*;

//定义扑克牌(♣10 ♠10 ♦K ♥J ♥A ♦3 ......)
//让你按照 整理牌的顺序 对这个数据进行排序
//规则:相同的在一起 2最大 3最小 ...
public class Testcard {
    String[] color={"♥","♦","♣","♠"};
    String[] num={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
    @Test
    public void test() {
        //保存52张牌
        List<card> list=new ArrayList<>();
        for(String c:color){
            for(int i=0;i<num.length;i++){
                list.add(new card(c+num[i],i));
            }
        }
        System.out.println("对扑克牌进行初始化");
        System.out.println(list);
        System.out.println("对扑克牌进行洗牌");
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("抽取16张牌并排序");
        Set<card> set=new TreeSet<>((c1, c2)->{
            int result=c1.n-c2.n;
            if(result==0){
                return c1.str.compareTo(c2.str);
            }
            return result;
        });
        for(int i=0;i<16;i++){
            list.get(i);
            set.add(list.get(i));
        }
        System.out.println(set);
    }

}
class card{
    String str;//牌的内容 ♠5 ♥A
    int n;//牌的大小
    public card(String str,int n){
        this.str=str;
        this.n=n;
    }
    public String toString(){
        return str;
    }
}

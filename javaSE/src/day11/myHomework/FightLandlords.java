package day11.myHomework;

import org.junit.Test;

import java.util.*;

//b.实现斗地主随机发牌的功能 一共54张牌
//   牌的花色分为   梅花   红桃   黑桃  方片
//   牌有  3  4 5 6 7 8 9 10 J  Q K  A  2  大王 小王
//   随机发给两个农民 和一个地主      地主 多三张牌
//   最后显示每人的牌的结果    最后还需要对每人的牌进行排序
public class FightLandlords {
    String[] color={"♥","♦","♣","♠"};
    String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
    @Test
    public void test(){
        List<card> list = new ArrayList<>();
        for(String c:color){
            for(int i=0;i<number.length;i++){
                list.add(new card(c+number[i],i));
            }
        }
        list.add(new card("小王",13));
        list.add(new card("大王",14));
        System.out.println("对扑克牌进行初始化");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println("对扑克牌进行洗牌");
        System.out.println(list);
        Set<card> set1=new TreeSet<>((c1,c2)->{
            if(c1.n-c2.n==0){
                return c1.str.compareTo(c2.str);
            }else {
                return c1.n-c2.n;
            }
        });
        Set<card> set2=new TreeSet<>((c1,c2)->{
            if(c1.n-c2.n==0){
                return c1.str.compareTo(c2.str);
            }else {
                return c1.n-c2.n;
            }
        });
        Set<card> set3=new TreeSet<>((c1,c2)->{
            if(c1.n-c2.n==0){
                return c1.str.compareTo(c2.str);
            }else {
                return c1.n-c2.n;
            }
        });
        System.out.println("第一个农民的牌：");
        for(int i=0;i<17;i++){
            set1.add(list.get(0));
            list.remove(0);
        }
        System.out.println(set1);
        System.out.println("第二个农民的牌：");
        for(int i=0;i<17;i++){
            set2.add(list.get(0));
            list.remove(0);
        }
        System.out.println(set2);
        System.out.println("地主的牌：");
        for(int i=0;i<20;i++){
            set3.add(list.get(0));
            list.remove(0);
        }
        System.out.println(set3);
    }
}
class card{
    String str;
    int n;
    public card(String str,int n){
        this.str=str;
        this.n=n;
    }
    public String toString(){
        return str;
    }
}
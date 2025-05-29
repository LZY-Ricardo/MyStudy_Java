package day11;

import sun.reflect.generics.tree.Tree;

import java.util.*;

//b.实现斗地主随机发牌的功能 一共54张牌
//   牌的花色分为   梅花   红桃   黑桃  方片
//   牌有  3  4 5 6 7 8 9 10 J  Q K  A  2  大王 小王
//   随机发给两个农民 和一个地主      地主 多三张牌
//   最后显示每人的牌的结果    最后还需要对每人的牌进行排序
public class Work4 {
    public static void main(String[] args) throws InterruptedException {
        String[] color={"♥","♦","♣","♠"};
        String[] number={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //定义集合 存储54张牌
        List<card> cards= new ArrayList<>();
        for(String c:color){
            for(int i=0;i<number.length;i++){
                cards.add(new card(c+number[i],i));
            }
        }
        //存储大小王
        cards.add(new card("大🃏",14));
        cards.add(new card("小🃏",13));
        System.out.println("洗牌之前："  + cards);
        System.out.println("****开始洗牌了剩余3秒****");
        for(int i=0;i<3;i++){
            Thread.sleep(1000);
            System.out.println("还剩"+(2-i)+"秒");
        }
        Collections.shuffle(cards);//打乱顺序
        System.out.println("洗牌之后："  + cards);

        //开始发牌 按顺序发即可
        List<card> a=new ArrayList<>();
        List<card> b=new ArrayList<>();
        List<card> boss=new ArrayList<>();
        //51 3个人按顺序发 剩余3张
        while(cards.size()>3){
            a.add(cards.remove(0));
            b.add(cards.remove(0));
            boss.add(cards.remove(0));
        }
        //给地主剩余三张牌
        while(!cards.isEmpty()){
            boss.add(cards.remove(0));
        }

        System.out.println("排序前的结果:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(boss);
        Comparator<card> com=(c1,c2)-> c2.n-c1.n;
        Collections.sort(a,com);
        Collections.sort(b,com);
        Collections.sort(boss,com);

        System.out.println("排序后的结果:");
        System.out.println("农民1"+a);
        System.out.println("农民2"+b);
        System.out.println("地主"+boss);
    }
}

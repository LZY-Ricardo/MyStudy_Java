package day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//a.创建HashMap集合，以商品名做键，以售出数量做值
// 循环使用键盘输入商品名称，如果输入“end”表示结束循环不再输入数据
// 如果map中没有这个商品，售卖数量设置为1次
// 如果map中有这个商品，售卖数量加1次
// 遍历map集合，打印商品名称和售卖的数量
public class Homework {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入商品名称：(end结束)");
            String name=sc.next();
            if("end".equals(name)) break;
            if(m.containsKey(name)){//不是第一次 +1
                m.put(name,m.get(name)+1);
            }else {// 是第一次 1
                m.put(name,1);
            }
        }
        System.out.println("购买完毕");
        for(String key:m.keySet()){
            Integer value=m.get(key);
            System.out.println("商品名："+key+" 购买数量："+value);
        }
    }
}

package day12.MyHomework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class homework {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        test1();
    }
//a.创建HashMap集合，以商品名做键，以售出数量做值
// 循环使用键盘输入商品名称，如果输入“end”表示结束循环不再输入数据
// 如果map中没有这个商品，售卖数量设置为1次
// 如果map中有这个商品，售卖数量加1次
// 遍历map集合，打印商品名称和售卖的数量
    public static void test1(){
        Map<String,Integer> map=new HashMap<>();
        while (true){
            System.out.println("请输入商品名称:(输入end结束循环)");
            String name = sc.next();
            if("end".equals(name)){
                break;
            }else{
                if(!map.containsKey(name)){
                    map.put(name,1);
                }else{
                    map.put(name,map.get(name)+1);
                }
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println("商品名:"+entry.getKey()+"\n售出数量:"+entry.getValue());
        }
    }
}




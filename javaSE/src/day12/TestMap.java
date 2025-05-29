package day12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        Map<String,String> map2=new Hashtable<>();
        map.put("java","编程语言");
        map.put(null,"我是空");
        map.put("mysql",null);

//        map2.put(null,"我也是空");
//        map2.put("我也是空",null);

        System.out.println("Map集合的遍历========");
        //由于Map集合没有顺序所以没有下标 不能使用标准for遍历
        for(int i=0;i<map.size();i++){
            //map.get(key);==>value
        }
        //增强for,底层是迭代器iterator()属于Collection的方法
        //所以Map不可以通过增强for或者迭代器直接遍历,但是可以间接遍历
        System.out.println("使用增强for========");
        for(String key:map.keySet()){
            String value=map.get(key);
            System.out.println(key+"===="+value);
        }
        for(Map.Entry<String,String> e:map.entrySet()){
            String key=e.getKey();
            String value=e.getValue();
            System.out.println(key+"===="+value);
        }
        System.out.println("使用迭代器========");
        Iterator<String> it=map.keySet().iterator();
        while(it.hasNext()){
            String key=it.next();
            String value=map.get(key);
            System.out.println(key+"===="+value);
        }
        Iterator<Map.Entry<String,String>> it2=map.entrySet().iterator();
        while(it2.hasNext()){
            Map.Entry<String,String> entry=it2.next();
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"===="+value);
        }
    }
}

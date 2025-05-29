package day12;

import java.util.*;

public class Demo {
    //面试题:有一个字符串 里面每个单词是通过空格隔开的
    //统计每个单词出现的次数,并且你还要根据出现的次数
    //进行降序排列
    public static void main(String[] args) {
        String str="java mysql java vue mysql spring java vue vue vue";
        //定义一个map集合 key作为单词 value作为出现的次数
        Map<String,Integer> map=new HashMap<>();
        //先通过String的方法split根据空格进行分割 再做单词的遍历
        for (String word:str.split(" ")){
            //判断单词的key是否存在
            if(map.containsKey(word)){//非第一次出现 次数+1
                map.put(word,map.get(word)+1);
            }else{//第一次出现 次数为1
                map.put(word,1);
            }
        }
        System.out.println(map);

        //开始排序:将map集合获取EntrySet 存储到list中
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        //利用集合工具类 sort(list,比较器对象)
        Collections.sort(list,(e1,e2)->e2.getValue()-e1.getValue());

        for(Map.Entry<String,Integer> entry:list){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}

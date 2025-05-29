package day11;

import org.junit.Test;

import java.util.*;

//List和Set和数组相互转换
public class ListSetArray {
    @Test
    public void arrayToList(){
        //Array===>List 和 Set
        Integer[] nums={1,3,5,7,9};
        List<Integer> list= Arrays.asList(nums);
        Set<Integer> set=new HashSet<>(Arrays.asList(nums));
    }
    @Test
    public void listToArray(){
        List<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        //list===>array
        Object[] os=list.toArray();
        Integer[] nums=list.toArray(new Integer[0]);
        //set===>array
        Integer[] nums2=set.toArray(new Integer[0]);
    }
    @Test
    public void listToSet(){
        //set===>list
        Set set=new HashSet<>();
        List list=new ArrayList(set);
        Set set2=new HashSet(list);
    }
}

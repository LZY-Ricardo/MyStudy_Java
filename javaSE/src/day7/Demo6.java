package day7;
public class Demo6 {
    public static void main(String[] args) {
        //int的封装类型 引用类型
        Integer a=20;
        Long b=20l;
        System.out.println(a.equals(b)); //false
        System.out.println(a.intValue()==b.longValue());//true

        String s="java";
        StringBuilder sb=new StringBuilder("java");
        System.out.println(s.equals(sb));//false
        System.out.println(s.equals(sb.toString()));//true
        System.out.println(s==sb.toString());//false
    }
}

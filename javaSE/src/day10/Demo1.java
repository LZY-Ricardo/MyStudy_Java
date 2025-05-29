package day10;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("第一种:对象类hashcode,根据引用地址计算");
        Demo1 d1=new Demo1();
        Demo1 d2=new Demo1();
        Demo1 d3=d1;
        System.out.println("d1:"+d1.hashCode());
        System.out.println("d2:"+d2.hashCode());
        System.out.println("d3:"+d3.hashCode());

        System.out.println("第二种:基本类型封装类型,存储里面的数值");
        Integer num1=100;
        Long num2=1000l;
        Integer num3 = new Integer(2000);
        System.out.println("num1:"+num1.hashCode());
        System.out.println("num2:"+num2.hashCode());
        System.out.println("num3:"+num3.hashCode());

        System.out.println("第三种:String类型,根据字符串内容计算");
        String str1="java";
        String str2=new String("java");
        String str3="mysql";
        System.out.println("str1:"+str1.hashCode());
        System.out.println("str2:"+str2.hashCode());
        System.out.println("str3:"+str3.hashCode());
        //String类型hashcode比较特殊:可能会存在hash冲突
        //哈希冲突:如果内容相同 计算得到hashcode一定相同的
        //        如果hashcode相同 但是值就一定相同吗(不一定的)
        //哈希冲突:就是hashcode相同 而值不同
        String s="java";
        Integer n=3254818;
        System.out.println(s.hashCode());
        System.out.println(n.hashCode());
        //s1和s2的hashcode值相同 值不相同 属于哈希冲突
        String s1="重地";
        String s2="通话";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

package day7;
//String特殊性
public class Demo7 {
    public static void main(String[] args) {
//        String a="hello2"; //指向常量池
//        String b="hello"+2; //指向常量池
//        System.out.println(a==b);//false true √

//        String a="hello2"; //指向常量池hello2
//        String b="hello";  //指向常量池的hello
//        String c=b+2;      //指向b的引用+2
//        System.out.println(a==c);//false √ true

//        String a="hello2"; //指向常量池hello2
//        final String b="hello"; //指向常量池的hello
//        String c=b+2;  //指向 常量b+2 == hello2
//        System.out.println(a==c); //false true √

        String a="hello2";
        //b虽然 是final修饰的  但是b的值需要方法返回才能确定
        //不运行不知道结果  所以java认为先保存一个引用地址 而不是常量
        final String b=get();
        String c=b+2; //b引用+2
        System.out.println(a==c); //false √ true
    }
    public static String get(){
        return "hello";
    }
}

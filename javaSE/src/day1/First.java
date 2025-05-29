package day1;
//源文件名和公开类是一样的
public class First {
    public static void main(String[] args){
        //换行 println()自动打印换行
        //print() 打印不换行
        System.out.println("我是xx");
        System.out.println("来自于东华理工大学");
        // \n 也可以实现换行   前提放在" "里面编写
        System.out.println("软件工程专业\n应届毕业生");

        //类型 变量名=值
        byte b1=127;
        String s2="java";
        //jdk(jre(jvm)+java类库)
        Two t1=new Two();
        Three t2=new Three();
        Four t3=new Four();
    }
}
//可以有很多类 但是公开类只有一个
class Two{
    public static void main(String[] args){

    }
}
class Three{
    public static void main(String[] args){

    }
}
class Four{
    public static void main(String[] args){}
}

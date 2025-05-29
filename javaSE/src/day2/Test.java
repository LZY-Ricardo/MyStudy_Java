package day2;

public class Test {
    public static void main(String[] args) {
        //有一个有钱人 往银行里存钱  第一天存储1元
        //以后每天都会比前一天多存50%
        //1.他存储第几天会超过10元 (适合使用while或do-while)
        double sum=1;
        int day=1;
        double temp=1; //默认值 保存第一天存储的1元
        while (sum<=10){
            day++;
            //保存每次存储的钱
            //temp=temp*1.5;
            temp*=1.5;
            sum+=temp;
            System.out.println(day+"-----"+sum);
        }
        System.out.println("第"+day+"天超过10元");
        System.out.println("--------------------------");
        //2.一个月后(30) 他总共存储了多少钱(适合for)
        double sum2=1;
        double temp2=1;
        for (int i=2;i<=30;i++){
            temp2*=1.5;
            sum2+=temp2;
            System.out.println(i+"-----"+sum2);
        }
        System.out.println("一个月后:"+sum2+"元");
    }
}

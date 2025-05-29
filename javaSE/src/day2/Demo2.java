package day2;

public class Demo2 {
    public static void main(String[] args) {
        //通过循环 完成 统计1-100总和(奇数和 偶数和)
        System.out.println("----while----");
        //写循环: 循环条件  循环每次执行哪些重复的内容
        //        变量1-100之内    累加求和
        int n=1;
        int sum=0;
        while (n<=100){
            //sum=sum+n;   简化版
            sum+=n;
            //循环变量改变
            //n=n+1;  简化版
            n++;  //++n; n++;
        }
        System.out.println("sum:"+sum);


        System.out.println("----do-while----");
        System.out.println("求1-100之间奇数和");
        int num=1;
        int sum2=0;
        do{
            //num%2 相当于 num/2求余数
            if (num%2!=0) sum2 += num;
            num++;
        }while(num<=100);
        System.out.println("奇数和:"+sum2);

        System.out.println("----for----");
        int sum3=0;
        for(int i=1;i<=100;i++){
            if(i%2==0) sum3 += i;
        }
        System.out.println("偶数和:"+sum3);
    }
}

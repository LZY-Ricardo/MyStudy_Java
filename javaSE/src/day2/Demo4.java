package day2;
//演示循环的退出
public class Demo4 {
    public static void main(String[] args) {
        System.out.println("开始执行main");
        test();
        System.out.println("结束结束main");
    }
    public static void test(){
        System.out.println("for循环开始");
        one:
        for(int j=0;j<2;j++) {
            System.out.println("这是第一重循环");
            int k=0;
            //给循环打标记 标记就是一个别名 标记:
            two:
            while(k<3) {
                System.out.println("这是第二重循环");
                k++;
                for (int i = 1; i <= 10; i++) {
                    System.out.println("这是第三重循环");
                    //i==5想结束循环
                    //结束整个程序  后面所有代码都不会执行
                    //if(i==5) System.exit(0);
                    //结束当前test()  但是外面的main()还会执行
                    //if(i==5) return;
                    //结束当前循环
                    //if(i==5) break;
                    //如果循环是多重循环  break到指定的标记中
                    if(i==5) break one;
                    System.out.println("执行了第" + i + "次循环");
                }

            }
        }
        System.out.println("for循环结束了");
    }
}

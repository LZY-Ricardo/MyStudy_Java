package day5;

import java.util.Scanner;

/*定义一个银行帐户类BankAccount实现银行帐户的概念，
在BankAccount类中定义两个变量："帐号" (account) 和密码password 和"存款余额"(money)，
再定义四个方法："存款" (addMoney)、"取款"(minusMoney) 、 "查询余额" (getMoney)、构造方法(BankAccount)。
通过主方法测试:  先登录 根据账号密码判断   失败可以重新登录  三次失败程序结束
                        登录 成功 显示二级菜单   1.存款   2.取款   3.查询余额
                        要求 存款取款必须是100的倍数
a.  登录功能
******XXXX银行系统******
1.登录
2.退出
请输入编号:
***************************

b.二级菜单
******XXX登录成功********
1.存款
2.取款
3.查询余额
*****************************/
public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456", "password");
        Scanner sc = new Scanner(System.in);
        int number=3;
        while (number>0) {
            System.out.println("******XXXX银行系统******");
            System.out.println("1.登录");
            System.out.println("2.退出");
            System.out.println("请输入编号:");
            System.out.println("***************************");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.println("请输入账号：");
                String amount = sc.nextLine();
                System.out.println("请输入密码：");
                String password = sc.nextLine();
                if (myAccount.account.equals(amount) && myAccount.password.equals(password)) {
                    System.out.println("******XXX登录成功********");
                    while (true) {
                        System.out.println("1.存款");
                        System.out.println("2.取款");
                        System.out.println("3.查询余额");
                        System.out.println("****************************");
                        int choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("请输入你要存取的金额：");
                                double qian = sc.nextDouble();
                                myAccount.addMoney(qian);
                                break;
                            case 2:
                                System.out.println("请输入你要取款的金额：");
                                double quqian = sc.nextDouble();
                                myAccount.minusMoney(quqian);
                                break;
                            case 3:
                                myAccount.getMoney();
                                break;
                            default:
                                System.out.println("无效选择,请重新选择");
                                continue;
                        }
                        System.out.println("是否结束当前操作？输入y(不区分大小写)退出,输入其他任意字符继续选择操作");
                        char finish=sc.next().toLowerCase().charAt(0);
                        if (finish == 'y') {
                            break;
                        }
                    }
                } else {
                    number--;
                    System.out.println("账号或密码错误,请重新输入,您还剩下"+number+"次登录机会");
                }
            } else if (choice == 2) {
                System.out.println("感谢使用,再见");
                return;
            } else {
                System.out.println("无效选择,请重新输入");
            }
            if(number==0){
                System.out.println("您的尝试机会已用尽,即将退出");
            }
        }
    }
}

class BankAccount {
    String account;
    String password;
    double money;

    public BankAccount(String account, String password) {
        this.account = account;
        this.password = password;
        this.money = 0;
    }

    public void addMoney(double qian) {
        if (qian % 100 == 0 && qian != 0) {
            this.money += qian;
            System.out.println("存钱成功！当前余额为：" + money);
        } else {
            System.out.println("存款失败,存取金额必须是100的倍数！");
        }
    }

    public void minusMoney(double quqian) {
        if (quqian % 100 == 0 && quqian > 0 && this.money > quqian) {
            this.money -= quqian;
            System.out.println("取钱成功！当前余额为：" + money);
        } else {
            System.out.println("取款失败,取款金额必须是100的倍数、大于0、不超过余额");
        }
    }

    public void getMoney() {
        System.out.println("当前余额：" + this.money);
    }
}

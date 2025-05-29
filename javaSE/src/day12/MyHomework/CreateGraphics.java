package day12.MyHomework;

import java.util.Scanner;

public class CreateGraphics {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("请选择你要创造的图形(A.圆形 B.矩形 C.三角形)");
            String choice=s.next();
            GraphicsFactory gf=null;
            switch(choice){
                case "A":
                    gf=new GraphicsFactoryA();
                    break;
                case "B":
                    gf=new GraphicsFactoryB();
                    break;
                case "C":
                    gf=new GraphicsFactoryC();
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
            if(gf!=null){
                Graphics g=gf.createGraphics();
                g.draw();
            }
            System.out.println("是否继续(y/n)");
            String choice2=s.next();
            if(choice2.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}

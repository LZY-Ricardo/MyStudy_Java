package day4;

import java.text.DecimalFormat;

/**1.定义一个圆类——Circle，在类的内部提供一个属性：半径®，同时 提供 两个 方 法 ：
 *  计算 面积 （ getArea() ） 和 计算 周长（getPerimeter()） 。
 *  通过两个方法计算圆的周长和面积并且对计算结果进行输出。最后定义一个测试类对 Circle 类进行使用
 */
public class Circle1 {
    double r;
    public Circle1(double r){
        this.r = r;
    }
    public double getArea(){
        return Math.PI *Math.pow(r,2);
    }
    public double getPerimeter(){
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        Circle1 c=new Circle1(10);
        double area=c.getArea();
        double perimeter=c.getPerimeter();
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println("面积: "+df.format(area));
        System.out.println("周长: "+df.format(perimeter));
    }
}

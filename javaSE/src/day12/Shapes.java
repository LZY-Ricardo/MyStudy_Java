package day12;
//b.你正在设计一个图形库，其中需要支持绘制不同类型的图形，如圆形、矩形和三角形。每个图形都有自己的绘制方法。
//你希望实现一种灵活的方式来创建不同类型的图形对象，并在未来轻松添加新的图形类型。
//要求：使用工厂方法模式设计一个图形工厂接口，并实现三个具体的图形工厂类： CircleFactory
//RectangleFactory 和 TriangleFactory 。每个工厂类负责创建相应类型的图形对象
//提示:
//1. 定义图形接口：创建一个图形接口，其中包含用于绘制图形的抽象方法。
//2. 创建具体图形类：对于每种图形类型，创建具体的图形类实现图形接口，实现绘制方法。
//3. 定义图形工厂接口：创建一个图形工厂接口，其中包含用于创建图形对象的工厂方法。
//4. 创建具体图形工厂类：对于每种图形类型，创建具体的图形工厂类实现图形工厂接口，负责创建
//相应的图形对象。
//5. 使用工厂方法：在图形库的客户端代码中，通过选择适当的图形工厂类来创建图形对象
public interface Shapes {
    void draw();
}
class Circle implements Shapes {
    public void draw() {
        System.out.println("开始画圆形");
    }
}
class Rectangle implements Shapes{
    public void draw(){
        System.out.println("开始画矩形");
    }
}
class Triangle implements Shapes{
    public void draw(){
        System.out.println("开始画三角形");
    }
}
//图形工厂类 提供创建 图形的抽象方法
interface ShapesFactory {
    Shapes create();
}
//圆形工厂 生产圆形对象
class CircleFactory implements ShapesFactory {
    public Shapes create(){
        return new Circle();
    }
}
//矩形工厂 生产矩形对象
class RectangleFactory implements ShapesFactory {
    public Shapes create(){
        return new Rectangle();
    }
}
//三角形工厂 生产三角形对象
class TriangleFactory implements ShapesFactory {
    public Shapes create(){
        return new Triangle();
    }

    public static void main(String[] args) {
        //创建圆形
        ShapesFactory s1=new CircleFactory();
        Shapes ss1=s1.create();

        ShapesFactory s2=new RectangleFactory();
        Shapes ss2=s2.create();

        ShapesFactory s3=new TriangleFactory();
        Shapes ss3=s3.create();

        ss1.draw();
        ss2.draw();
        ss3.draw();
    }
}
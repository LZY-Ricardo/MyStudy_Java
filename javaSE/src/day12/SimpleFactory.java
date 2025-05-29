package day12;
//简单工厂模式:提供一个方法 根据参数 来决定返回什么对象
public class SimpleFactory {
    public Product create(String type){
        Product p=null;
        switch (type){
            case "A":
                p=new ProductA();
                break;
            case "B":
                p=new ProductB();
                break;
            case "C":
                p=new ProductC();
                break;
        }
        return p;
    }
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        //使用简单工厂模式创建对象
        Product p1=factory.create("A");
        Product p2=factory.create("B");
        Product p3=factory.create("C");
        p1.product();
        p2.product();
        p3.product();
    }
}

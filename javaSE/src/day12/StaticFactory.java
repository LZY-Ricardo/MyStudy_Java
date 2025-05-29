package day12;
//静态工厂模式
public class StaticFactory {
    public Product create(String type){
        Product p=null;
        switch (type){
            case "A":
                p=createA();
                break;
            case "B":
                p=createB();
                break;
            case "C":
                p=createC();
                break;
        }
        return p;
    }
    public static ProductA createA(){
        //创建对象越复杂 这种 方式越好
        return new ProductA();
    }
    public static ProductB createB(){
        //创建对象越复杂 这种 方式越好
        return new ProductB();
    }
    public static ProductC createC(){
        //创建对象越复杂 这种 方式越好
        return new ProductC();
    }
}

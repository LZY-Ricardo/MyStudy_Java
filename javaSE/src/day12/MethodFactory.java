package day12;
//工厂方法模式
public interface MethodFactory {
    Product createObject();
}
//具体的工厂实现类(子工厂A,负责创建A对象)
class FactoryA implements MethodFactory {
    public Product createObject() {
        return new ProductA();
    }
}
class FactoryB implements MethodFactory {
    public Product createObject() {
        return new ProductB();
    }
}
class FactoryC implements MethodFactory {
    public Product createObject() {
        return new ProductC();
    }

    public static void main(String[] args) {
        //测试工厂方法模式
        //使用商品A 需要工厂A创建对象
        MethodFactory fA=new FactoryA();
        Product pA=fA.createObject();
        //使用商品C 需要工厂C创建对象
        MethodFactory fC=new FactoryC();
        Product pC=fC.createObject();
        pA.product();
        pC.product();
    }
}

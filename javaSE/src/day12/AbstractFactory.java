package day12;
//抽象工厂模式
public interface AbstractFactory {
    ProductsA createA();
    ProductsB createB();
}
//具体工厂1 负责生产高配商品
class Factory1 implements AbstractFactory{
    @Override
    public ProductsA createA() {
        return new GoodsA1();
    }

    @Override
    public ProductsB createB() {
        return new GoodsB1();
    }
}
//具体工厂2 负责生产低配商品
class Factory2 implements AbstractFactory{
    @Override
    public ProductsA createA() {
        return new GoodsA2();
    }

    @Override
    public ProductsB createB() {
        return new GoodsB2();
    }

    public static void main(String[] args) {
        AbstractFactory f1=new Factory1();
        ProductsA a1=f1.createA();
        ProductsB b1=f1.createB();
        a1.product();
        b1.product();


        AbstractFactory f2=new Factory2();
        ProductsA a2=f2.createA();
        ProductsB b2=f2.createB();
        a2.product();
        b2.product();
    }
}

//创建目标对象
//定义抽象生产商品A接口
interface ProductsA{//小米厂商
    void product();//生产
}
//具体的商品A1   高配
class GoodsA1 implements ProductsA{
    public void product(){
        System.out.println("生产A1商品(高配)");
    }
}
//具体的商品A2   低配
class GoodsA2 implements ProductsA{
    public void product(){
        System.out.println("生产A2商品(低配)");
    }
}


//定义抽象生产商品B接口
interface ProductsB{//比亚迪厂商
    void product();//生产
}
//具体的商品B1   高配
class GoodsB1 implements ProductsB{
    public void product(){
        System.out.println("生产B1商品(高配)");
    }
}
//具体的商品B2   低配
class GoodsB2 implements ProductsB{
    public void product(){
        System.out.println("生产B2商品(低配)");
    }
}
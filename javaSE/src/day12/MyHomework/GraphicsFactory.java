package day12.MyHomework;

public interface GraphicsFactory {
    Graphics createGraphics();
}
class GraphicsFactoryA implements GraphicsFactory {
    public Graphics createGraphics(){
        return new Circle();
    }
}
class GraphicsFactoryB implements GraphicsFactory {
    public Graphics createGraphics(){
        return new Rectangle();
    }
}
class GraphicsFactoryC implements GraphicsFactory {
    public Graphics createGraphics(){
        return new Triangle();
    }
}
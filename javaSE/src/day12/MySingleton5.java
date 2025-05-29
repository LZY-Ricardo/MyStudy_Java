package day12;
//枚举实现:
public enum MySingleton5 {
    ONE;
    //private MySingleton5(){}
    public static MySingleton5 get(){
        return ONE;
    }
}

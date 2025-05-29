package day6;

public class Dept {
    int id;
    String dname;
    static String loc;

    public static void main(String[] args) {
        Dept d=new Dept();
        d.id=10;
        d.dname="教学部";
        d.loc="南昌";
        Dept d2=new Dept();
        Dept d3=d; //d3指向 d的对象
        System.out.println(Dept.loc);
        //System.out.println(Dept.dname);

        System.out.println(d2.dname);//null
        System.out.println(d3.dname);//教学部

        System.out.println(d2.loc);//南昌
        System.out.println(d3.loc);//南昌
    }
}

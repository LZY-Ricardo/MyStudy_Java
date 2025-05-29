package day6.homework;

import java.util.Arrays;

public class Animal {
    public void makeSound(){
        System.out.println("父类声音");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("喵喵喵");
    }
}
class Cow extends Animal {
    public void makeSound() {
        System.out.println("哞哞哞");
    }
}
class Zoo{
    Animal[] animals=new Animal[10];
    int index=0;//存储元素索引值
    public void add(Animal animal){
        if(index>=animals.length){
            //对数组扩容 1.5倍
            expansion();
            System.out.println("开始扩容,新的长度:"+animals.length);
        }
        //animals[index]=animal;
        //index++;
        animals[index++]=animal;
    }
    public void showAnimalSounds(){
        for(Animal a:animals){
            if(a!=null) a.makeSound();
        }
    }
    public void expansion(){
//        int newLength=(int)(animals.length*1.5);
//        Animal[] newArray=new Animal[newLength];
//        for(int i=0;i<animals.length;i++){
//            newArray[i]=animals[i];
//        }
//        animals=newArray;

        int newLength=(int)(animals.length*1.5);
        animals=Arrays.copyOf(animals,newLength);
    }
    public static void main(String[] args) throws InterruptedException {
        Zoo z=new Zoo();
        Animal a1=new Dog();
        Animal a2=new Dog();
        Animal a3=new Cat();
        Animal a4=new Cat();
        Animal a5=new Cow();
        Animal a6=new Cow();
        z.add(a1);
        z.add(a2);
        z.add(a3);
        z.add(a4);
        z.add(a5);
        z.add(a6);
        for(int i=0;i<100;i++){
            Thread.sleep(1000);
            z.add(a6);
        }
        z.showAnimalSounds();
    }
}

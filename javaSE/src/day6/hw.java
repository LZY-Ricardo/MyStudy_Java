package day6;

import java.util.ArrayList;
import java.util.List;

public class hw {
    public static void main(String args[]){
        Animal animal=new Animal();
        Dog dog=new Dog();
        Cat cat=new Cat();
        Cow cow=new Cow();
        Zoo zoo=new Zoo();
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
        zoo.addAnimal(cow);
        zoo.showAnimalSounds();
    }
//    a.给定一个整数数组nums，编写一个程序，统计数组中每个数字出现的次数，并将结果输出
    public static void h1(){
        int[] nums = new int[]{2,5,2,3,3,45,112,0,6,1,9};
        int[] count = new int[113];
        for(int num:nums){
            count[num]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                System.out.println(i+"出现了"+count[i]+"次");
            }
        }
    }

}
//    b.设计一个简单的动物园管理系统，展示多态的应用。
//    要求： 创建一个Animal父类，具有makeSound()方法，
//    。 创建几个继承Animal类的子类：Dog、Cat、Cow。
//    每个子类都实现makeSound()方法，分别输出不同的声音。
//    创建一个Zoo类，其中包含一个List<Animal>，用于管理动物。
//    通过addAnimal(Animal animal)方法将动物添加到动物园。
//    在Zoo类中实现一个方法showAnimalSounds()，遍历所有动物，
//    调用每个动物的makeSound()方法，展示动物的声音
class Animal{
    public void makeSound(){
        System.out.println("Animal is making sound");
    }
}
class Dog extends Animal {
    public void makeSound(){
        System.out.println("Dog is making sound");
    }
}
class Cat extends Animal {
    public void makeSound(){
        System.out.println("Cat is making sound");
    }
}
class Cow extends Animal {
    public void makeSound(){
        System.out.println("Cow is making sound");
    }
}
class Zoo{
    List<Animal> animals = new ArrayList<>();
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void showAnimalSounds(){
        for(Animal animal:animals){
            if(animal!=null)animal.makeSound();
        }
    }
}


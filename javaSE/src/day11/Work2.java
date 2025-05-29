package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//b.某班有 40 个学生，学号为 180201-180240，
// 全部参加 Java 集合阶段检测，给出所有同学的成绩
// （可随机产生，范围为 50-100），请编写程序将本班
//各位同学成绩从高往低排序打印输出，
// 注：成绩相同时学号较小的优先打印
//要求：打印的信息包含学号、姓名和成绩 。
public class Work2 {
    public static void main(String[] args) {
        Random r=new Random();
        List<Student> list=new ArrayList<>();
        for(int i=0;i<40;i++){
            int score=r.nextInt(51)+50;
            list.add(
                    new Student(
                        180200+i,
                        "学生"+i,
                        score
                    )
                );
        }
        Collections.sort(list,(s1,s2)->{
            int i=(int)(s2.score-s1.score);
            if(i==0){
                return s1.id-s2.id;
            }else{
                return i;
            }
        });
        for(Student s:list){
            System.out.println(s);
        }
    }
}
class Student{
    Integer id;
    String name;
    double score;

    public Student(Integer id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

package day8;

import java.time.LocalDate;

public class test {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.of(2004,02,11);
        LocalDate ld1=LocalDate.now();
        int i=ld.until(ld1).getYears();
        System.out.println(i);
        Integer I=10;
        String s=String.valueOf(I);
        System.out.println(s);
        String s1="123";
        Integer I1=Integer.valueOf(s1);
        System.out.println(I1);
        Integer I2 = Integer.parseInt(s1);
        System.out.println(I2);
    }
}

package day2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        h4();
    }

    /**
     * a.自定义一个整形数组，
     * 求出数组元素的奇数和，偶数和，最大值和最小值
     */
    public static void h1() {
        int[] arr = {1, 2, 3, 6, 5, 4, 8, 7, 9};
        int jssum = 0;
        int ossum = 0;
        int max = 0;
        int min = 0;
        for (int num : arr) {
            if (num % 2 == 0) ossum += num;
            else jssum += num;
            if (jssum > max) max = jssum;
            if (jssum < min) min = jssum;
        }
        System.out.println("奇数和:" + jssum);
        System.out.println("偶数和:" + ossum);
        System.out.println("最大值:" + max);
        System.out.println("最小值:" + min);
    }

    /**
     * b.自定义一个长度为10的整形数组，
     * 将数组最大值保存在数组第1位(提示最大值和第一位互换)
     */
    public static void h2() {
        int[] arr = new int[10];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        System.out.println("原数组:" + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        if (index != 0) {
            int temp = arr[0];
            arr[0] = arr[index];
            arr[index] = temp;
        }
        System.out.println("互换后数组:" + Arrays.toString(arr));
    }

    /**
     * c.向一个长度为5的整型数组中随机生成5个1-10的随机整数,
     * 要求生成的数字中没有重复数
     */
    public static void h3() {
        int[] arr = new int[5];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = (int) (Math.random() * 10) + 1;
            for (int num : arr) {
                if (num == temp) {
                    i--;
                    break;
                }
            }
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * a.定义一个数组{2,3,4,5,2,3,4,2,2,2,2},
     * 求数组中出现次数超过一半的元素
     */
    public static void h4() {
        int[] arr = new int[]{2, 3, 4, 5, 2, 3, 4, 2, 2, 2, 2};
        int candidate = 0;
        int count = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            System.out.println("数组中出现次数超过一半的元素为: " + candidate);
        } else {
            System.out.println("数组中出现次数没有超过一半的元素");
        }
    }
}
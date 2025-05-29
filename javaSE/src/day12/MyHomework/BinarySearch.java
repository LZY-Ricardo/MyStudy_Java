package day12.MyHomework;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = binarySearch(arr, 5);
        System.out.println(index);
    }
    public static int binarySearch(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target>arr[mid]){
                left=mid+1;
            }else if(target<arr[mid]){
                right=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

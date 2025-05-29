package day2;

public class practice {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,2,2,2,5,9,1,3,10};
        int cc=0;
        for(int i=0;i<array.length-4;i++){
            if(array[i]==array[i+1]&&array[i]==array[i+2]&&array[i]==array[i+3]){
                cc=array[i];
            }
        }
        System.out.println(cc);
    }
}

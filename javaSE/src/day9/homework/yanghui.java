package day9.homework;
//       1
//      1 1
//     1 2 1
//    1 3 3 1
//   1 4 6 4 1
//1 5 10 10 5 1
public class yanghui {
    public static void main(String[] args) {
        int n=10;
        int[][] nums=new int[n][n];
        for(int i=0;i<n;i++){//控制行
            for(int j = 0; j < 1+i; j++){//控制每行打印的内容
                if(j==0 || j==i) nums[i][j]=1;
                else nums[i][j]=nums[i-1][j]+nums[i-1][j-1];
            }
        }
        System.out.println("打印结果:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 1+i; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}

package day2;
//练习题:自定义一个整型数组，测试数组中是否存在连续的4个相同的数字
public class Test2 {
    public static void main(String[] args) {
        int[] nums={1,3,7,7,7,7,6,1,2};
        boolean b=false;
        ooo:
        for (int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
                if(count==4){
                    b=true;
                    break ooo;
                }
            }
        }
        if(b) System.out.println("存在4个连续的");
        else System.out.println("不存在4个连续的");
    }
}

package practice;

public class Main {
    public static void main(String[] args) {

        int[] op = new int[2];
        int[] nums = {2,7,11,15};
        int target = 9;
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    op[0]=i;
                    op[1]=j;
                }
            }
        }
        System.out.println("Output: "+op[0]+" "+op[1]);
    }
}




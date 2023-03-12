package Assignment_1;

public class left_rotation {
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 2;
        k%=nums.length;
        nums = helper(nums,0,nums.length-1);
        nums = helper(nums,nums.length-k,nums.length-1);
        nums = helper(nums,0,nums.length-k-1);
        for(int i : nums) System.out.print(i+" ");
    }
    public static int[] helper(int[] arr,int s,int e){
        while(s<e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
        return arr;
    }
}

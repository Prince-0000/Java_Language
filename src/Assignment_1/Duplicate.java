package Assignment_1;
import java.util.*;
public class Duplicate {
    public static void main(String[] args){
        int nums[] = {1,2,3,1,2,5,2,1,8};
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                System.out.print(nums[i]+" ");
            }
        }
    }
}

package Assignment_1;

public class Delete {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,2,2};
        int k = 2;
        int[] ans = new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=k){
                ans[j++] = arr[i];
            }
        }
        for(int i : ans) System.out.print(i+" ");
    }
}

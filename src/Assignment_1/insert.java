package Assignment_1;

public class insert {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int[] newarr = new int[arr.length+1];
        int pos = 3;
        int ele = 20;
        int j=0;
        for(int i=0;i<=arr.length;i++){
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = ele;
            else
                newarr[i] = arr[i - 1];
        }
        for(int i : newarr) System.out.print(i+" ");
    }
}

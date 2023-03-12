package Assignment_1;
import java.util.*;
public class Largest_Smallest {
    public static void main(String[] args){
        int arr[] = {8,21,28,2,8,10,4};
        Arrays.sort(arr);
        System.out.println("Second Largest = "+arr[arr.length-2]);
        System.out.println("Second smallest = "+arr[1]);
    }
}

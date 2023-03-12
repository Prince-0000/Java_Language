package Assignment_1;

public class Palindrome {
    public static void main(String[] args){
        String s = "78287";
        boolean flag = checkPalindrome(s);
        if(flag==true)
            System.out.println("It is Palindrome");
        else
            System.out.println("No, it is not Palindrome");
    }
    public static boolean checkPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

package Unit1;
import java.util.Scanner;
public class CalculatorUse {
    public static void main(String[] args) throws ZeroException{
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("Enter the value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter your choice : ");
        System.out.println("+\n-\n*\n/");

        char ch = sc.next().charAt(0);

        switch(ch){
            case '+' : System.out.println(c.add(a,b));
                        break;
            case '-' : System.out.println(c.subtract(a,b));
                        break;
            case '*' : System.out.println(c.multiply(a,b));
                        break;
            case '/' : System.out.println(c.divide(a,b));
                        break;
            default : System.out.println("Invalid Input");
        }
    }
}


package Assignment_1;
import java.util.*;
import java.time.*;
public class switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        System.out.println("1.Current Year\n2.Current Month\n3.Current Day");
        int choice = sc.nextInt();
        switch(choice){
            case 1: System.out.println("Current Year : "+date.getYear());
                    break;
            case 2: System.out.println("Current Month : "+date.getMonth());
                    break;
            case 3: System.out.println("Current Day : "+date.getDayOfMonth());
                    break;
            default: System.out.println("Not applicable");
        }
    }
}

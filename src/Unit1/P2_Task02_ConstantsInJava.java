package Unit1;
import java.util.*;

public class P2_Task02_ConstantsInJava {
//    java: non-static variable status cannot be referenced from a static context
//    final String status = "Jatt Zamidar";
      final static String status = "Jatt Zamidar";

    public static void main(String[] str){
//        java: modifier static not allowed here
//        final static int a = 10;
          final int a = 20;

        System.out.println(status);
        System.out.println(a);
    }
}

import java.util.*;

public class Average_of_threeNum {
    
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;

        System.out.println(avg);
    }
}
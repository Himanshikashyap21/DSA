import java.util.Scanner;

public class Income_Tax_Calculator {
       public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Income ");
        int income =scanner.nextInt();
        
        int tax;

        if (income<500000) {
            tax=0;

            
        }
        else if (income>=500000 && income <1000000) {
            tax =(int)(income*0.2);

            
        }
        else{
            tax=(int)(income*0.3);
        }
        System.out.println("Your Tax is : " + tax);

       }
}
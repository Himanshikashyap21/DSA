import java.util.*; 
public class Break_in_Loops {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
            // if(i==3){
                // break;
            // }
            // System.out.println(i);
        // }
        // System.out.println("Out of Loop");



        // Keep entering numbers till user enters a multiple of 10 ---->
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}

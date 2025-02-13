import java.util.*;
public class h_subarrays {
    public static void printSubarrays(int numbers[]){
        int total_subarrays=0;
        for (int i = 0; i < numbers.length; i++) {
            int start=i;
            for(int j=i; j<numbers.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){   //print
                    System.out.print(numbers[k]+" "); //subarray
                }
                total_subarrays++; 
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays ="+ total_subarrays);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,25};
        printSubarrays(numbers);
    }
}
// Total number of Subarrays = n(n+1)/2
// Time Complexity: O(n^3)
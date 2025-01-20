import java.util.*;
public class g_pairs_in_array {


    public static void printPairs(int numbers[]){
        int total_pairs=0;
        for (int i = 0; i < numbers.length; i++) {
            int current =numbers[i]; //6,9,4,0,2
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j]+ ") ");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs ="+ total_pairs);
    }

    
    public static void main(String args[]){
        int numbers[] ={6,9,4,0,2,7};
        printPairs(numbers);
    }
}

// Total Pairs = n(n-1)/2;
// Time Complexity =n^2;    


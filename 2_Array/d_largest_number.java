import java.util.*;
public class d_largest_number {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE; //-infinity
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest Value is :"+ smallest);
    return largest;
    }
    public static void main(String[] args) {
        int[] numbers = {0, 2, 3, 4, 5,69};
        System.out.println("Largest Number is : "+ getlargest(numbers));
    }
}

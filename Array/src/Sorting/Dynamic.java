// Program: Dynamic Array Simulation for Citizen Rewards  
// Topic: Arrays and Dynamic Data Handling  
// Description: Simulates a system where each citizen’s contribution is stored, and whenever the king visits (input -1),  
// the highest contribution is displayed and removed from the list. Demonstrates array manipulation, dynamic updates, and element removal logic.
package Sorting;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Dynamic 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter No Of Citizens :");
        int n = sc.nextInt();//no of citizens
         System.out.println("Enter No of Times King Visited :");
        int m = sc.nextInt();//no of times king visited

        int arr[] = new int[n + m];
        int size = 0;

        while (n + m-- > 0) {
            int a = sc.nextInt();
            if (a != -1) {
                arr[size++] = a;
            } 
            //when king visits a=-1 and max value is found ,printed and removed
            else {
                int maxIndex = 0;
                for (int i = 0; i < size; i++) {
                    if (arr[i] > arr[maxIndex]) {
                        maxIndex = i;
                    }
                }
                System.out.println(arr[maxIndex]);
                
                // Remove the max element by shifting elements
                for (int i = maxIndex; i < size - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                size--; // Reduce size after removing the max element
            }
        }
    }
}

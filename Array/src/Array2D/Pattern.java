// Program: Generate Number Pattern Using 2D Array  
// Topic: 2D Arrays and Nested Loops  
// Description: Uses a one-dimensional array to fill a 5x5 matrix in a specific pattern.  
// Prints decreasing number sequences and the resulting 2D array, demonstrating nested loop logic and array indexing.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int  ar[]={1,2,3,4,5};
        int a[][]=new int [5][5];
        int p=0,z=0;
        
        for(int i=5;i>=1;i--){
            p=0;
            for(int j=1;j<=i;j++){
                a[z][p]=ar[p];
                p++;
            }     
            
            z=0;
            for(int k=5;k>i;k--){
                System.out.print(k);
               ;
                z++;
            }
            System.out.println();
        }
        
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
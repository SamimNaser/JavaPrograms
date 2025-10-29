// Program: Rotate a 3x3 Matrix Clockwise and Anticlockwise  
// Topic: 2D Arrays and Matrix Manipulation  
// Description: Reads a 3x3 integer matrix from user input, prints it rotated by 90 degrees clockwise,  
// then prints it rotated by 90 degrees anticlockwise. Demonstrates nested loops and index manipulation for matrix rotation.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Rotate {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int ar[][]=new int [3][3];
        
        //Input of Elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ar[i][j]=sc.nextInt();
            }
        } 
        
        //Rotating the matrix by 90 degree clockwise
        System.out.println("Clockwise :");
        for(int i=0;i<3;i++){
            for(int j=2;j>=0;j--){
                System.out.print(ar[j][i]+" ");
            }
            System.out.println();
        }
        
        //Rotating the matrix by 90 degree anti-clockwise
        System.out.println("Anticlockwise :");
        for(int i=2;i>=0;i--){
            for(int j=0;j<=2;j++){
                System.out.print(ar[j][i]+" ");
            }
            System.out.println();
        }
    }
}
      
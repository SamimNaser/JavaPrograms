// Program: Check for Symmetric and Skew-Symmetric Matrices  
// Topic: 2D Arrays and Matrix Properties  
// Description: Reads a 3x3 matrix from user input and checks whether it is symmetric or skew-symmetric.  
// Uses separate methods to compare elements across the main diagonal and displays the result based on user choice.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Symmetric {
    public boolean SymmetricCheck(int ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(ar[i][j]!=ar[j][i]){
                    return false;
                }
            }
        }
        return true; 
    }
    
    public boolean SkewSymmetricCheck(int ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(ar[i][j]!=-(ar[j][i])){
                    return false;
                }
            }
        }
        return true; 
    }
    
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        int ch;
        int arr[][]=new int [3][3];
        
        
        System.out.println("Enter The Elements :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Choice :");
        System.out.println("1.Symmetric");
        System.out.println("2.Skew Symmetric");
        ch=sc.nextInt();
        
        Symmetric obj=new Symmetric();
              
        switch (ch) {
            case 1 : {
                boolean flag=obj.SymmetricCheck(arr);
                
                if(flag==true)
                    System.out.println("Symmetric Matrix !");
                else
                    System.out.println("Non Symmertric Matrix !");
            }
            case 2 : {
                boolean flag2=obj.SkewSymmetricCheck(arr);
                
                if(flag2==true)
                    System.out.println("Skew-Symmetric Matrix !");
                else
                    System.out.println("Non Skew-Symmertric Matrix !");
            }
            default : throw new AssertionError();
        }
    }
}

// Program: Transpose of a Square Matrix  
// Topic: 2D Arrays and Matrix Manipulation  
// Description: Reads an m×m matrix from user input and computes its transpose by interchanging rows and columns.  
// Demonstrates use of nested loops for matrix traversal and creation of a new transposed matrix.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Tranpose {
    int ar[][];   
    int arr[][];
    int m;
    public Tranpose(int mm) {
        m=mm;
        ar=new int[m][m];
        arr=new int[m][m];
    }
    void fillarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements of Array :");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                ar[i][j]=sc.nextInt();
            }
        }
    }
    void transpose(){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr[j][i]=ar[i][j];
                arr[i][j]=ar[j][i];
            }
        }
    }
    void display(){
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter size of matrix");
        Tranpose obj=new Tranpose(sc.nextInt());
        obj.fillarray();
        obj.transpose();
        obj.display();
    }
}

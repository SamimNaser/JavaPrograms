// Program: Calculate Total Marks and Grade for Students  
// Topic: 2D Arrays and Conditional Statements  
// Description: Stores marks of students in multiple subjects using a 2D array.  
// Calculates total marks and average for each student, then assigns a grade (A–D) based on the average score.
package Array;
import java.util.*;
/**
 *
 * @author Samim
 */
public class TestScore 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[2][3];
        int total[]=new int[2];
        char Grade[]=new char[2];
        int avg;
        for(int i=0;i<2;i++)
        {
            total[i]=0;
            System.out.println("Subject "+(i+1));
            for(int j=0;j<3;j++)
            {
                System.out.println("Student :"+(j+1));
                ar[i][j]=sc.nextInt();
                total[i]+=ar[i][j];
            }
        }
        for(int i=0;i<2;i++)
        {
            avg=total[i]/3;
            if(avg<45)
            {
                Grade[i]='D';
            }
            else if(avg>=45 && avg<60)
            {
                Grade[i]='C';
            }
            else if(avg>=60 && avg<75)
            {
                Grade[i]='B';
                
            }
            else if(avg>=75)
            {
                Grade[i]='A';
            }
        }
        for(int i=0;i<2;i++)
        {
            System.out.println("Student "+(i+1));
            System.out.println("Total Marks ="+total[i]);
            System.out.println("\tGrade ="+Grade[i]);
        }
    }
}
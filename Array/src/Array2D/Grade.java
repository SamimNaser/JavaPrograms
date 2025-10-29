// Program: Calculate Student Grades and Rank List  
// Topic: 2D Arrays, Loops, and Conditional Statements  
// Description: Accepts names and marks of 3 students in 3 subjects, calculates total and average marks,  
// assigns grades based on average, and generates a ranked list of students according to total marks.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Grade 
{
        static Scanner sc=new Scanner (System.in);
        static String name[]=new String[3];
        static int marks[][]=new int[3][3];
        static int total[]=new int [3];
        static float avg;
        static char grade[]=new char[3];
    public static void main(String args[])
    { 
         Grade obj=new Grade();
            obj.Input();
            obj.rank();
    }
    
    public void Input()
        {
        for(int i=0;i<3;i++)
        {
            total[i]=0;
            System.out.println("Enter Name Of Student :");
            name[i]=sc.next();
            System.out.println("Enter Marks Of Three Subjects :");
            for(int j=0;j<3;j++)
            {   
                marks[i][j]=sc.nextInt();
                total[i]+=marks[i][j];
            }
        }
        for(int i=0;i<3;i++)
        {
            avg=total[i]/3;
            if(avg<45.0)
            {
                grade[i]='D';
            }
            else if(avg <60.0)
            {
                grade[i]='C';
            }
            else if(avg <75.0)
            {
                grade[i]='B';
            }
            else 
            {
                grade[i]='A';
            }
        System.out.println("Student :"+(i+1));
        System.out.println("Total Marks :"+total[i]);
            System.out.println("Average Marks :"+avg);
            System.out.println("Grade :"+grade[i]);
            
            System.out.println();
        }
    }
        
    public void rank()
    {
        System.out.println("Rank List :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3-i-1;j++)
            {
                if(total[j+1]>total[j])
                {
                    int temp=total[j+1];
                    total[j+1]=total[j];
                    total[j]=temp;
                    
                    String temp2=name[j+1];
                    name[j+1]=name[j];
                    name[j]=temp2;
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            System.out.println((i+1)+" rank : "+name[i]);
            System.out.println("Total Marks :"+total[i]);
            
            System.out.println();
        }
    }   
}

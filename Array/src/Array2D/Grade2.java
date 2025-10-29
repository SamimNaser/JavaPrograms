// Program: Generate Student Rank List Based on Total Marks  
// Topic: 2D Arrays, Sorting, and Loops  
// Description: Accepts names and marks of 2 students in 3 subjects, calculates total marks for each,  
// and sorts them in descending order to display a ranked list. Demonstrates nested loops and array swapping for sorting logic.
package Array2D;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Grade2 
{
    public static String name[]=new String[2];
    public static int total[]=new int[2];
    
    public static void Input()
    {
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[2][3];
        
        
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter Name Of Students :");
            name[i]=sc.next();
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter The Marks "+(j+1));
                ar[i][j]=sc.nextInt();
                
                total[i]+=ar[i][j];
            }
            System.out.println(total[i]);
        }
    }
//    public static void Grade()
//    {
//        char grade[]=new char[2];
//        double avg;
//        for(int i=0;i<3;i++)
//        {
//            //avg=total[i]/3;
//            if(avg<45.0)
//            {
//                grade[i]='D';
//            }
//            else if(avg <60.0)
//            {
//                grade[i]='C';
//            }
//            else if(avg <75.0)
//            {
//                grade[i]='B';
//            }
//            else 
//            {
//                grade[i]='A';
//            }
//        }
//    }
    public static void RankList()
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
    public static void main(String args[])
    { 
        Input();
        //Grade();
        RankList();
    }
}

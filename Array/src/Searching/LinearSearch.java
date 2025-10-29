// Program: Linear Search Implementation  
// Topic: Searching Algorithms (Arrays)  
// Description: Reads five integers into an array and searches for a given element using linear search.  
// Displays the position of the element if found, otherwise prints “Element Not Found.” Demonstrates basic array traversal and conditional logic.
package Searching;
import java.util.*;
/**
 *
 * @author Samim
 */
public class LinearSearch 
{
 
    public void input(int ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Elements :");
        for(int i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }
    }
    public int searching(int search, int ar[])
    {int flag= 0;
        for(int i=0;i<5;i++)
        {
            if(ar[i]==search)
            {
                flag=i+1;
                break;
            }
        }
        return flag;
    }
    
    public void display(int flag)
    {
        if(flag!=0)
        {
            System.out.println("Element Found At Position :"+flag);
        }
        else
        {
            System.out.println("Element Not Found");
        }
    }
    public static void main(String args[])
    {
        LinearSearch obj=new LinearSearch();
        int search = 10;
        int ar[]=new int[5];
        obj.input(ar);
        int index = obj.searching(search,ar);
        obj.display(index);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Fibonacci2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter The Number Of Terms :");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(fibonacci(i)+"");
        }
    }
    public static int fibonacci(int n){
        if(n<=1)
        {
            return n;
        }
        else 
        {
            return fibonacci( n-1)+fibonacci(n-2);
        }
    }
    
}

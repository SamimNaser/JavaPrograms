// Program: Find Subarray with Given Sum
// Topic: Arrays
// Description: Reads an array and a target sum, then finds a continuous subarray whose elements add up to the given sum. 
// Uses nested loops and sliding window logic to identify the subarray indices.
package Array;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Amazon {
    int ar[];
    int Sar[];
    int S;
    Amazon(int n,int value){
        Sar=new int[2];
        ar=new int[n];
        S=value;
    }
    public void input(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter The Elements Of Array :");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
    }
    public void Subarrya(){
        int sum=0;
        int flag;
        int counter=0;
        for(int i=0;i<ar.length;i++){
            for(int j=i;j<ar.length;j++){
                sum=sum+ar[j];
                
                if(sum==S){
                    System.out.println("matched");
                    counter=j;
                    flag=1;
                }
            }
            int start=0;
            sum=sum+ar[i];
            while(sum>S && start<i){
                sum-=ar[start];
                start++;
            }
            if(sum==S){
                Sar[0]=start+1;
                Sar[1]=i+1;
                break;
            }
            else
            {
                Sar[0]=-1;
            }
        }
    }
    public void Display(){
        for(int i=0;i<2;i++){
            System.out.print(Sar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        int n;
        int rsum;
        System.out.println("Enter length Of Array :");
        n=sc.nextInt();
        System.out.println("Enter Required Sum :");
        rsum=sc.nextInt();
        
        Amazon obj=new Amazon(n,rsum);
        obj.input();
        obj.Subarrya();
        obj.Display();
    }
}

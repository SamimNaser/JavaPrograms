// Program: Trapping Rainwater Problem  
// Topic: Arrays and Two-Pointer Technique  
// Description: Calculates the total amount of rainwater that can be trapped between bars of different heights.  
// Uses precomputed left and right maximum arrays to determine trapped water at each index efficiently.
package Array;

/**
 *
 * @author Samim
 */
public class Rainwater {
        int ar[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=ar.length;
        int trapw=0;
    public static void main(String args[]){
        
        Rainwater obj=new Rainwater();
        System.out.println("Total Trapped Water :");
        System.out.println(obj.check());
    }
    int check(){
        if(ar==null || ar.length==0){
            return 0;
        }
        
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        
        lmax[0]=ar[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(lmax[i-1],ar[i]);  
        }
        
        rmax[n-1]=ar[n-1];
        for(int j=n-2;j>=0;j--){
            rmax[j]=Math.max(rmax[j+1],ar[j]);
        }
        
        for(int i=0;i<n;i++){
            trapw+=Math.min(rmax[i],lmax[i])-ar[i];
        }
        
        return trapw;
    }
}


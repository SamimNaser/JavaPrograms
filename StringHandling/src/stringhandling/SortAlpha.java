// Program: Sort Words in a Sentence Alphabetically  
// Topic: String Handling and Sorting  
// Description: Accepts a sentence from user input, splits it into individual words,  
// sorts them alphabetically using compareTo(), and displays the sorted sentence in uppercase.  
// Demonstrates string splitting, comparison, and array manipulation.
package stringhandling;
import java.util.*;
/**
 *
 * @author Samim
 */
public class SortAlpha {
    String sent;
    public SortAlpha() {
        sent="";
        int n=sent.length();
    }
    void acceptsent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Sentence");
        sent=sc.nextLine().toUpperCase();
    }
    void sort(SortAlpha P){
        String ar[]=P.sent.split(" ");
        
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i].compareTo(ar[j])>0){
                    String temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        for (String ar1 : ar) {
            sent += ar1 + " ";
        }
    }
    void display(){
        System.out.println(sent);
    }
    public static void main(String args[]){
        SortAlpha obj=new SortAlpha();
        SortAlpha obj2=new SortAlpha();
        obj.acceptsent();
        obj2.sort(obj);
        obj.display();
        obj2.display();
    }
}

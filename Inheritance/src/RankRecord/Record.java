package RankRecord;
import java.util.*;
/**
 *
 * @author Samim
 */
public class Record {
    String name[];
    int rank[];
    Record(){
        name=new String[3];
        rank=new int[3];
    }
    void readvalues(){
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter Name ALong With Rank :");
                
        for(int i=0;i<name.length;i++){
            System.out.println("Enter Name :");
            name[i]=sc.next();
            System.out.println("Enter Rank :");
            rank[i]=sc.nextInt();
        }
    }
    void display(){
        System.out.println("Name :\t Rank :");
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]+"\t"+rank[i]);
        }
    }
}

// Program: Tower of Hanoi Using Recursion  
// Topic: Recursion and Algorithmic Problem Solving  
// Description: Solves the classic Tower of Hanoi problem using recursion.  
// Moves ‘N’ disks from the source peg to the destination peg using an intermediate peg.  
// Demonstrates recursive decomposition where each move consists of transferring N-1 disks recursively.  
package recursion;
/**
 *
 * @author Samim
 */
public class TowerOfHanai {
    public void move(int N,char snd1,char ind1,char dnd1){
        if(N!=0){
            move(N-1,snd1, dnd1, ind1);
            System.out.println("\nMoveDisk "+N+" from "+snd1+" to "+dnd1);
            move(N-1, ind1, snd1, dnd1);
        }
        return ;
    }
    public static void main(String[] args) {
        char start ='L',inter ='C',dest='R';
        int N=3;
        TowerOfHanai toh=new TowerOfHanai();
        toh.move(N, start, inter, dest);
    }
}

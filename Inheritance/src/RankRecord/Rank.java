package RankRecord;
/**
 *
 * @author Samim
 */
public class Rank extends Record{
    int index=0;
    int highest=100;
    void highest(){
        for(int i=0;i<name.length;i++){
            if(rank[i]<highest){
                highest=rank[i];
                index=i;
            }
        }
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Topmost Rank :");
        System.out.println(name[index]+"\t"+rank[index]);
    }
}

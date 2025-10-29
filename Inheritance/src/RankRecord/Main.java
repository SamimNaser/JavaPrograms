// Program: Student Ranking System (Main Class)  
// Topic: Inheritance and Method Execution Flow  
// Description: Serves as the main entry point for the Student Record and Ranking System.  
// Creates an object of the `Rank` class, which inherits from `Record`, then calls methods to read student data,  
// determine the highest-ranked student, and display the results. Demonstrates method invocation across inherited classes.
package RankRecord;
/**
 *
 * @author Samim
 */
public class Main  {
    public static void main(String []args){
        Rank obj=new Rank();
        obj.readvalues();
        obj.highest();
        obj.display();
        
    }
}

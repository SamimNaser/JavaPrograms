// Program: Employee and Manager Inheritance Example  
// Topic: Inheritance and Object-Oriented Programming  
// Description: Demonstrates inheritance in Java using `Employee` as a base class and `Manager` as a subclass.  
// The `Day` class stores hiring dates, while `Manager` adds a secretary name and overrides `raiseSalary()`  
// to include a bonus based on years of service. The `ManagerTest` class tests the relationship by creating  
// objects, updating salaries, and displaying employee details.
package inheritence;
import java.util.Calendar;
/**
 *
 * @author Samim
 */
public class Day {
    int year,month,day;
    Day(){
        Calendar cal=Calendar.getInstance();
        day=cal.get(Calendar.DATE);
        month=cal.get(Calendar.MONTH);
        year=cal.get(Calendar.YEAR);
    }
    Day(int y,int m,int d){
        year=y;month=m;day=d;
    }
    int getYear(){
        return year;
    }
}
class Employee{
    private final String name;
    private double salary;
    private Day hireDay;
    public Employee(String n,double s,Day d){
        name=n;
        
    }
    
    public void print(){
        System.out.println(name+""+salary+""+hireYear());
    }
    public void raiseSalary(double byPercent){
        salary*=1+byPercent/100;
    }
    public int hireYear(){
        return hireDay.getYear();
    }
    
}
class Manager extends Employee{
    private String secretaryName;
    public Manager(String n,double s,Day d){
        super(n, s, d);
        secretaryName="";
    }
    @Override
    public void raiseSalary(double byPercent){
        Day today=new Day();
        double bonus=0.5*(today.getYear()-hireYear());
        super.raiseSalary(byPercent+bonus);
    }
    public void setSecretaryName(String n){
        secretaryName=n;
    }
    public String getSecretaryName(){
        return secretaryName;
    }
    
}
class ManagerTest{
    public static void main(String []args){
        Manager boss=new Manager("Nikit Sharma",75000,new Day(1997,12,15));
        boss.setSecretaryName("Jane Robin");
        Employee[] staff=new Employee[3];
        
        staff[0]=boss;
        staff[1]=new Employee("Jane",35000,new Day(2009,10,1));
        staff[2]=new Employee("Tony",38000,new Day(2010,3,5));
        
        int i;
        for(i=0;i<3;i++){
            staff[i].raiseSalary(5);
        }
        for(i=0;i<3;i++){
            staff[i].print();
        }
        System.out.println("The departement secretary is "+boss.getSecretaryName());
    }  
}

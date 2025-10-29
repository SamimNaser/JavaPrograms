// Program: Validate and Display Date in Readable Format  
// Topic: String Handling and Conditional Logic  
// Description: Accepts a date in six-digit format (DD/MM/YY) as input, validates the day, month, and year,  
// and displays it in a readable format such as “12 March, 2023.” Demonstrates substring extraction,  
// numeric parsing, switch-case logic, and leap year validation.
package stringhandling;
import java.util.*;
/**
 *
 * @author Samim
 */
public class ValidDate {
    static boolean isValidDate(String date){
        
        int maxDays;
        int day;
        int month;
        int year;
        if(date.length()!=6){
            return false;
        }
        
        else {
            day =Integer.parseInt(date.substring(0,2));
            month=Integer.parseInt(date.substring(3,4));
            year=Integer.parseInt(date.substring(4));
        
            if(month<1 || month>12 ){
            return false;
            }
            
            else{
                switch (month) {
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        maxDays = 30;
                        break;
                    case 2:
                        maxDays=(year % 4==0 &&(year % 100!=0 || year % 400!=0))?28:29;
                        break;
                    default:
                        maxDays = 31;
                }
            }
        }
        return day>=1 && day <=maxDays;
    }
    static String displayDate(String date){
        if (isValidDate(date)) {
            int day = Integer.parseInt(date.substring(0, 2));
            int month = Integer.parseInt(date.substring(3, 4));
            int year = Integer.parseInt(date.substring(4));

            String[] months = {"January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"};

            return "The date is " + day + " " + months[month - 1] + ", " + year;
        } 
        else {
            return "Invalid date";
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Date In Six Digits :");
        System.out.println("Format : {DD/MM/YY)");
        String data=sc.nextLine();
        //System.out.println(isValidDate(data));
        System.out.println(displayDate(data));
    }
}

        

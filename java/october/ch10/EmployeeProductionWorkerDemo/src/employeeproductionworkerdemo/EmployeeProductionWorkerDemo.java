/*
Design a class named Employee. The class should keep the following information fields.
-Employee name
-Employee number in the format XXX–L, where each X is a digit within the range
0–9 and the L is a letter within the range A–M.
-Hire date
Spencer Folgate 11-5-21
JDK Version 1.8
*/
package employeeproductionworkerdemo;
import javax.swing.JOptionPane;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class EmployeeProductionWorkerDemo {
    public static void main(String[] args) {
        String input;
        String name;
        String ID="000-X";
        String hireDate;
        int shift;
        double hourlyRate;
        boolean validater=false;
        input=JOptionPane.showInputDialog(null,"Enter employee name: ");
        name=input;  
        do{ //validater for employee number
        input=JOptionPane.showInputDialog(null,"Enter employee ID.");
            if (input.matches("[0-9]{3}-[A-M]{1}")){
               ID=input;
               validater=true;}
            }while(validater==false);
        validater=false;
        do{input=JOptionPane.showInputDialog(null,"Enter date hired: ");
        if(input.matches("[1]{1}[]))
            
        }while(validater==false);
        input=JOptionPane.showInputDialog(null,"Enter shift number: ");
        shift=Integer.parseInt(input);
        input=JOptionPane.showInputDialog(null,"Enter hourly pay rate: ");
        hourlyRate=Double.parseDouble(input);
                
        
//        System.out.println(ID);
        
        ProductionWorker worker1=new ProductionWorker(name,ID,hireDate,shift,hourlyRate);
        
        System.out.println(worker1);
    }
    
}

/*
Your goal is to design a class named Person and a class named Customer which 
extends the Person class.  
Spencer Folgate
11-7-21
JDK Version 1.8
 */
package personcustomerdemo;

public class PersonCustomerDemo {

    public static void main(String[] args) {
        
        Customer dena=new Customer("dena","505 E Exchange","555-5555","187505",true);
        System.out.println(dena);
        dena.setName("Dena Ortiz");
        
        System.out.println("\n"+dena);
        System.out.println("\n"+dena.getName());
        System.out.println(dena.getAddress());
        System.out.println(dena.getTelephone());
        System.out.println(dena.getCustomerNumber());
        System.out.println(dena.getMailingList());
        
        System.out.println("\n"+dena);
        
    }
    
}

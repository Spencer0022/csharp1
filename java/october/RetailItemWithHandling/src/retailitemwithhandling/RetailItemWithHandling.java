/*
Chapter 6 Project 4 RetailItemClass with ExceptionHandling from Chapter 11
Spencer Folgate
JDK Verison 1.8
11-20-21
 */
package retailitemwithhandling;

public class RetailItemWithHandling {


    public static void main(String[] args) {
        RetailItem item1 = new RetailItem();
        try{
        item1=new RetailItem("Blue Jeans",15,29.99);
        System.out.println(item1);
        }catch(BoundException e){
            System.out.println(e.getMessage());
        }
    }
    
}

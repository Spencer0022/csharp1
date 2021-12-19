
package storesystem;

public class Inventory {
    
    private String description;
    private int amount;
    private double regularPrice;
    private double memberPrice;
    
    public Inventory(String description, int amount, double regularPrice,double memberPrice){
        this.description = description;
        this.amount = amount;
        this.regularPrice=regularPrice;
        this.memberPrice=memberPrice;
        
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public double getMemberPrice(){
        return this.memberPrice;
    }
    public double getRegularPrice(){
        return this.regularPrice;
    }
    public String toString(){
        return "Item: "+ this.description+" has "+this.amount+
                " in stock at a price of "+this.regularPrice+
                " and a member's price of "+this.memberPrice;
    }
   
    
}

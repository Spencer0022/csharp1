
package retailitemwithhandling;


public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;
   
    public RetailItem(){
    }
    public RetailItem(String description,int unitsOnHand,double price) throws BoundException{
        if(unitsOnHand<0||price<0){
            throw new BoundException();
        }
        this.description=description;
        this.unitsOnHand=unitsOnHand;
        this.price=price;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setUnitsOnHand(int unitsOnHand){
        this.unitsOnHand=unitsOnHand;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getDescription(){
        return this.description;
    }
    public int getUnitsOnHand(){
        return this.unitsOnHand;
    }
    public double getPrice(){
        return this.price;
    }
    @Override
    public String toString(){
        return "Item: "+this.description+"\nUnits on Hand: "+this.unitsOnHand+"\nPrice: "+this.price;
    }
    
}

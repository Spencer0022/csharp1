package storesystem;
public class StoreSystem {

    public static void main(String[] args) {
        
        Inventory item1 = new Inventory("Apple Juice",15,3.99,3.49);
        System.out.println(item1.getDescription());
        item1.setDescription("Orange Juice");
        System.out.println(item1.getDescription());
        
        System.out.println(item1.getMemberPrice());
        System.out.println(item1);
        
        
    }
    
}

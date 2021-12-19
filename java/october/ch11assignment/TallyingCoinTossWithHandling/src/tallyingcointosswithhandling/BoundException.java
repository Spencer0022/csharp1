
package tallyingcointosswithhandling;


public class BoundException extends Exception{
    
    public BoundException(){
        super("Error: You must choose a value above 0.");
    }
    public BoundException(int request){
        super("Error: Value chosen was "+request);
    }
    
    public BoundException(String request){
        super("Error: Value chosen was out bound: "+ request);
    }
}

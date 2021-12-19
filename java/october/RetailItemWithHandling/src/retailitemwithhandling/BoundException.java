
package retailitemwithhandling;

public class BoundException extends Exception{
    
    public BoundException(){
        super("Error: Out of bounds.");
    }
    public BoundException(int input){
        super("Error: "+input+" is not an acceptable input.");
    }
    public BoundException(String input){
        super("Error: "+input+" is not an acceptable input.");
    }
    public BoundException(double input){
        super("Error: "+input+" is not an acceptable input.");
    }
    public BoundException(boolean input){
        super("Error: "+input+" is not an acceptable input.");
    }
}

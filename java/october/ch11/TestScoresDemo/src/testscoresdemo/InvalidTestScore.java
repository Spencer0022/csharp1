
package testscoresdemo;


public class InvalidTestScore extends Exception{
    
    public InvalidTestScore(){
        super("Error:Score must be from 0 to 100.");
    }
    public InvalidTestScore(double testScore){
        super("Error:Score out of range. Score given: "+testScore);
    }
    
    
}

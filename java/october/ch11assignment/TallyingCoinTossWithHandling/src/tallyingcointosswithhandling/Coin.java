
package tallyingcointosswithhandling;

import java.util.Random;
public class Coin {
    
    private int faceUpInt;
    private String faceUp;
    private int tossNumber;
    private String stringInput;
    
    public Coin(){
        this.tossNumber=0;
        this.faceUp=null;
        
         }
    
    public Coin(int tossNumber){
        
        this.tossNumber=tossNumber;
        this.faceUp=null;
        
    }
    
    public String coinToss(){
        Random roll = new Random();
        int side=roll.nextInt(2)+1;
        if(side==1){
            return "heads";}
            else
            return "tails";
    }
    public void setTossNumber(String input) throws BoundException{
        int temp=0;
        if(!input.matches("[1-9]+[0-9]*")&&!input.matches("[0-9]+[1-9]+[0-9]*")){
            throw new BoundException(input);
        }
        temp=Integer.parseInt(input);
        this.tossNumber=temp;
    }
    public String coinTossing(){
        int headsCounter=0;
        int tailsCounter=0;
        String sideUp;        
        for(int i=0;i<tossNumber;i++){
            sideUp=coinToss();
            if(sideUp.equals("heads")){
                headsCounter++;
            }else if(sideUp.equals("tails")){
                tailsCounter++;
            }
        }
        return "Heads resulted "+headsCounter+" times.\nTails resulted: "+tailsCounter+" times.";
    }
    
    }
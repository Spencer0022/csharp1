/*
Tallying Coin Toss game with Exception Handling Assignment
Spencer Folgate 11-20-21
JDK Version 1.8
 */
package tallyingcointosswithhandling;
import javax.swing.JOptionPane;


public class TallyingCoinTossWithHandling {
    
    public static void main(String[] args) {
            String input;   
            int integerInput;
            Coin coin1=new Coin();
            boolean validation=true;
            
            do{
                validation=true;
                input=JOptionPane.showInputDialog(null,"Enter the number of times"
                        + "you would like to roll the die.");
//                integerInput=Integer.parseInt(input);
                try{
                    coin1.setTossNumber(input);
                }catch(BoundException e){
                    System.out.println(e.getMessage());
                    validation=false;
                }
            }while(!validation);
            System.out.println(coin1.coinTossing());

                        
            

    }
    
}

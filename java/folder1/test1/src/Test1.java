
import javax.swing.JOptionPane;

public class Test1 {

    public static void main(String[] args) {
       int randNum = (int)(Math.random()*3)+1;       
       System.out.println(randNum);
       String response = null;
       String compPick = computerChoice(randNum);
       System.out.println(compPick);

       response = JOptionPane.showInputDialog(null,"Enter rock, paper or scissors.");
       String userPick = response;
       System.out.println(winnerResult(compPick,userPick));
        
    }
    public static String computerChoice(int num){
        String compPick = null;
        switch(num){
            case 1:
                compPick="Rock";
                break;
            case 2:
                compPick="Scissors";
                break;
            case 3:
                compPick = "Paper";
                break;
            default:
                compPick="Invalid";
                break;
                
               
        }
        return compPick;
    }
    public static String winnerResult(String compChoice,String userChoice){
        String result1 = null;
        if(compChoice.equals("Rock")&&userChoice.equals("Rock")){
            result1="Tie!";
    }   else if(compChoice.equals("Rock")&&userChoice.equals("Paper")){
            result1="You win!";
    } else if(compChoice.equals("Rock")&&userChoice.equals("Scissors")){
            result1="Computer wins!";
    } else if(compChoice.equals("Paper")&&userChoice.equals("Rock")){
            result1="Computer wins!";
    } else if(compChoice.equals("Paper")&&userChoice.equals("Scissors")){
            result1="You win!";
    }else if(compChoice.equals("Paper")&&userChoice.equals("Paper")){
            result1="Tie!";
    }else if(compChoice.equals("Scissors")&&userChoice.equals("Paper")){
            result1="Computer wins!";
    }else if(compChoice.equals("Scissors")&&userChoice.equals("Rock")){
            result1="You win!";
    }else if(compChoice.equals("Scissors")&&userChoice.equals("Scissors")){
            result1="Tie!";
    }
        return result1;
}
}
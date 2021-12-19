/*
Main file for StringReverser method 
Spencer Folgate 
JDK Version 1.8
 */
package stringreverser;
import javax.swing.JOptionPane;

public class StringReverser {


    public static void main(String[] args) {
        
        String str = JOptionPane.showInputDialog(null,"Enter your string to be reversed");
        Reverser.reverseString(str);
    }
    
}

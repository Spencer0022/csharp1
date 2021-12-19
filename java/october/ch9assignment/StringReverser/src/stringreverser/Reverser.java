
package stringreverser;

public class Reverser {
    
    private static StringBuilder temp = new StringBuilder();
    
    public static String reverseString(String str){
        temp.append(str).reverse();
        System.out.println(temp);
        return null;
    }
    
}

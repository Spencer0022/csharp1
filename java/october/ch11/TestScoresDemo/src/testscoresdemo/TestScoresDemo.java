/*
Test Scores / Error Demo
Spencer Folgate
11-20-21
JDK Version 1.8
 */
package testscoresdemo;

public class TestScoresDemo {


    public static void main(String[] args) {
        
        int array[]={100,100,100,90};
        TestScore test1=null;
        try{
            test1= new TestScore(array);
        }
        catch(InvalidTestScore e){
            System.out.println(e.getMessage());
        }
        

         System.out.println(test1.averageScore());
    }
    
}
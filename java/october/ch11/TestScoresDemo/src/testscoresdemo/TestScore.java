
package testscoresdemo;


public class TestScore{
    
    private int[] scores;
    
//    public TestScore(int array[]){
//            for (int i=0;i<array.length;i++){
//                if(array[i]<0||array[i]>100)
//                    throw new IllegalArgumentException("Score must be between "
//                            + "0 and 100");
//            }
//           this.scores=array;
//    }
        public TestScore(int array[]) throws InvalidTestScore{
        for (int i=0;i<array.length;i++){
            if(array[i]<0||array[i]>100)
                throw new InvalidTestScore(array[i]);
        this.scores=array;
}
}
    
    public void printFirst(){
        System.out.println(scores[0]);
    }
    public double averageScore(){
        double sum=0;
        for (int i=0;i<scores.length;i++){
            sum=sum+scores[i];
        }
        sum=sum/scores.length;
        return sum;
    }
    
}

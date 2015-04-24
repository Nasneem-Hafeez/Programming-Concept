package programmingConcept;
import java.math.*;
/**
 * Created by sudhir on 24/4/15.
 */
public class SumSquareDifference {
    public static void main(String[] arg ){
     SumSquareDifference obj=new SumSquareDifference();
        obj.difference();
    }
    private void difference(){

        int sumOfSquare=0;
        int squareOfSum=0;
        int  difference=0;
        for(int count=1;count<=100;count++){
            sumOfSquare+=count*count;
            squareOfSum+=count;
                    }
        squareOfSum= squareOfSum*squareOfSum;
        System.out.println("Final sumofsquare and square of sum :"+sumOfSquare+" , " +squareOfSum);
   difference=squareOfSum-sumOfSquare; //sumOfSquare-(squareOfSum*squareOfSum);
        System.out.println("The difference between the sum of square and square of sum from 1 to 100 is :"+difference);

    }

}

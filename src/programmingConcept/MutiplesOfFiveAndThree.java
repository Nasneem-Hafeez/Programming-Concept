package programmingConcept;

public class MutiplesOfFiveAndThree {

    public static void main(String[] args) {
       functionForSum();
        }
   public  static void functionForSum()
    {
        int sumofnumbers=0,count;
        System.out.println("Finding the sum of numbers which are multiples of 3 and 5/n");
        for(count=0;count<1000;count++) {
            if((count%5==0)||(count%3==0)){
                sumofnumbers += count;
            }
        }
        System.out.println("Result="+sumofnumbers);
    }
        }





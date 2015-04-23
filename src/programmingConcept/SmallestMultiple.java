package programmingConcept;

/**
 * Created by sudhir on 23/4/15.
 */
public class SmallestMultiple {
    public static void main(String[] arg)
    {
multiple();
    }
    private static void  multiple() {
        int number = 1;
        int i;
        boolean numberget = false;
        while (1 == 1) {
            for (i = 2; i <= 20; i++) {
                if (number % i != 0) {
                    break;

                }
                if(i==20){
                System.out.println("The smallest positive number divisible from 1 to 20 is : " + number);
                numberget = true;}
            }
            number++;
            if (numberget == true) {
                break;
            }
        }


    }

}

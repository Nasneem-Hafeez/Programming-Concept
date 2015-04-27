package programmingConcept;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by sudhir on 24/4/15.
 */
public class LargestProduct {
    static StringBuilder sb = null;

    public static void main(String[] arg) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/sudhir/Programming-Concept/src/programmingConcept/inputForPrime.txt"));
            String currentLine;
            String sample;
                 while ((currentLine = br.readLine()) != null)
                 {
                sample = currentLine;
                sb = new StringBuilder(sample);
                 }
            LargestProduct obj = new LargestProduct();
            ArrayList largestAnswer= obj.catagorize();
            ArrayList multiples=obj.getMultiplesOfArray(largestAnswer);
            long finalAnswer= obj.findLargest( multiples);
            System.out.println("the largest answer:"+largestAnswer);
            System.out.println("the multiplied  answer:"+multiples);
            System.out.println("the largest answer:"+finalAnswer);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ArrayList catagorize()
    {
        long largest=0;
        int first = 0;
        int last = 13;
        int index = 0;
        long str1=0;
        ArrayList<Long> valueWithoutZero=new ArrayList<Long>();
        while (last != 999)
        {
            String temp = sb.substring(first, last);
                    if (temp.indexOf('0') == -1)
                    {
                    str1 = Long.valueOf(temp);
                    valueWithoutZero.add(str1);
                    }
            first++;
            last++;
            index++;
        }
    return valueWithoutZero;
    }


    private long findLargest(ArrayList<Long> inputArray){
        long largest=0;
        for( Long number : inputArray)
        {

              long number1 = number.longValue() ;
               if ( number1 > largest )
               {
                      largest = number1 ;
               }
        }

     return largest;
    }

   private ArrayList getMultiplesOfArray ( ArrayList<Long> inputForMul ) {
       ArrayList<Long>outMul=new ArrayList<Long>();
       long product = 1;
       long rem;
              for( Long number : inputForMul){
               product=1;
               long number1 = number.longValue() ;
               System.out.println(number);
                    while (number1!= 0)
                    {
                    rem = number1 % 10;
                    number1 = number1 / 10;
                    product = product * rem;
                    }
               outMul.add(product);
       }
   return outMul;
   }
}
